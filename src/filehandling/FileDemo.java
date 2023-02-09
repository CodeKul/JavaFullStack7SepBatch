package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * System.out = std output stream
 * System.in = std input stream
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("input1.txt");
        try {
           if (file.createNewFile()){
               System.out.println("File Already exists");

           }else {
               System.out.println("File Created");
               System.out.println("File Name "+file.getName());
               System.out.println("Absolute Path "+file.getAbsolutePath());
               System.out.println("is File "+file.isFile());
               System.out.println("can Read "+file.canRead());
               System.out.println("can Write "+file.canWrite());
               System.out.println("can Execute "+file.canExecute());
               System.out.println("Length "+file.length());
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
