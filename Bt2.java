package Bt_10032025;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Bt2 {
    public static void main(String[] args) {
        List<String> danhSachFile = Arrays.asList("src/Bt_10032025/file1.txt", "src/Bt_10032025/file2.txt"
        );

        String tuKhoa = "java";

        ExecutorService executor = Executors.newFixedThreadPool(danhSachFile.size());
        List<Future<Integer>> ketQua = new ArrayList<>();

        for (String tenFile : danhSachFile) {
            Callable<Integer> nhiemVu = () -> demFile(tenFile, tuKhoa);
            Future<Integer> future = executor.submit(nhiemVu);
            ketQua.add(future);
        }

        executor.shutdown();

        int tongSoLanXuatHien = 0;
        for (int i = 0; i < ketQua.size(); i++) {
            try {
                int soLan = ketQua.get(i).get();
                System.out.println("File " + danhSachFile.get(i) + " co " + soLan + " lan xuat hien cua tu khoa \"" + tuKhoa + "\".");
                tongSoLanXuatHien += soLan;
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Tong so lan xuat hien cua tu khoa \"" + tuKhoa + "\": " + tongSoLanXuatHien);
    }

    public static int demFile(String tenFile, String tuKhoa) {
        int dem = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(tenFile))) {
            String dong;
            while ((dong = reader.readLine()) != null) {
                dem += demDong(dong, tuKhoa);
            }
        } catch (IOException e) {
            System.err.println("Loi doc file: " + tenFile);
        }
        return dem;
    }

    public static int demDong(String dong, String tuKhoa) {
        int dem = 0;
        int viTri = 0;
        while ((viTri = dong.indexOf(tuKhoa, viTri)) != -1) {
            dem++;
            viTri += tuKhoa.length();
        }
        return dem;
    }
}

