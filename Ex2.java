package Bt_10032025;

import java.io.*;
public class Ex2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/Bt_10032025/file1.txt")));

            int byteData;
            while ((byteData = br.read()) !=1){
                System.out.println((char)byteData);
            }

            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
