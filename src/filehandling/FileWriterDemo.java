package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/madhuri/workspace/2022/JavaFullStack7SepBatch/src/filehandling/demo12.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Hello");
           // fileWriter.write("\nWelcome to Java World!!!");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
            int n = fileReader.read();
            while (n>0){
                System.out.print((char)n);
                n = fileReader.read();
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            fileReader.close();
        }
    }
}
