package Bt_10032025;

import java.io.*;
public class Ex1 {
    public static void main(String[] args) {
        try {
            InputStream isr = new FileInputStream("src/Bt_10032025/file1.txt");
            OutputStream osr = new FileOutputStream("src/Bt_10032025/file2.txt");

            int byteData;
            while ((byteData = isr.read()) !=1){
                osr.write(byteData);
            }

            isr.close();
            osr.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
