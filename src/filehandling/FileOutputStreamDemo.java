package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String filePath = "/home/madhuri/workspace/2022/JavaFullStack7SepBatch/src/filehandling/welcome.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String msg = "Welcome to the Java World!!!";
            byte[] arr = msg.getBytes();
            fos.write(arr);
            fos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            FileInputStream fis = new FileInputStream(filePath);
            int n = fis.read();
            while (n>0){
                System.out.print((char)n);
                n = fis.read();
            }
            System.out.println();
            fis.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
