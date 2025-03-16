package Bt_10032025;

import java.io.*;

public class Ex3 {
    public static void main(String[] args) {
        String tenFile = "src/Bt_10032025/file2.txt";
        int soDong = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tenFile)));

            String dong;
            while ((dong = br.readLine()) != null) {
                soDong++;
            }

            br.close();

            System.out.println("Số dòng trong file là: " + soDong);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
