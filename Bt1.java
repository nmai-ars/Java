package Bt_10032025;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bt1 {

    static final int PART_SIZE = 1024 * 1024;

    public static void main(String[] args) {
        String fileGoc = "src/Bt_10032025/file1.txt";
        String fileKetQua = "src/Bt_10032025/file2.txt";

        try {
            File file = new File(fileGoc);
            long fileSize = file.length();
            int soLuongThread = (int) Math.ceil((double) fileSize / PART_SIZE);

            byte[][] dataParts = new byte[soLuongThread][];

            Thread[] threads = new Thread[soLuongThread];
            for (int i = 0; i < soLuongThread; i++) {
                final int index = i;
                threads[i] = new Thread(() -> {
                    try {
                        RandomAccessFile raf = new RandomAccessFile(fileGoc, "r");
                        long start = index * PART_SIZE;
                        long remaining = fileSize - start;
                        int bufferSize = (int) Math.min(PART_SIZE, remaining);
                        byte[] buffer = new byte[bufferSize];
                        raf.seek(start);
                        raf.readFully(buffer);
                        dataParts[index] = buffer;
                        raf.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

            try (FileOutputStream fos = new FileOutputStream(fileKetQua)) {
                for (byte[] part : dataParts) {
                    fos.write(part);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
