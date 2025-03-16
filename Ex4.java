package Bt_10032025;

import java.io.*;

public class Ex4 {
    public static void main(String[] args) {
        String tenFile = "src/Bt_10032025/file1.txt";

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(tenFile));

            int[] dsSoNguyen = {10, 20, 30, 40, 50};

            for (int so : dsSoNguyen) {
                dos.writeInt(so);
            }

            dos.close();
            System.out.println("Đã ghi danh sách số nguyên vào file " + tenFile);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(tenFile));

            System.out.println("Các số nguyên đọc được từ file:");
            while (dis.available() > 0) {
                int so = dis.readInt();
                System.out.print(so + " ");
            }

            dis.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
