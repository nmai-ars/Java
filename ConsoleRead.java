package Bt_10032025;

import java.io.*;
public class ConsoleRead {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("src/Bt_10032025/file1.txt"));

            int byteData;
            while ((byteData = isr.read()) !=1){
                System.out.println((char)byteData);
            }

            isr.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
