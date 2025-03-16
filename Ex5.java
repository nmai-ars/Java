package Bt_10032025;

import java.io.File;

public class Ex5 {
    public static void main(String[] args) {
        String dtm = "src/Bt_10032025";

        File thuMuc = new File(dtm);

        if (thuMuc.exists() && thuMuc.isDirectory()) {
            File[] danhSachFile = thuMuc.listFiles();

            if (danhSachFile != null && danhSachFile.length > 0) {
                System.out.println("Các file trong thư mục '" + dtm + "' là:");
                for (File file : danhSachFile) {
                    if (file.isFile()) {
                        System.out.println("- " + file.getName());
                    }
                }
            } else {
                System.out.println("Thư mục rỗng hoặc không có file nào.");
            }
        } else {
            System.out.println("Thư mục không tồn tại hoặc không đúng đường dẫn.");
        }
    }
}
