package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadOnlyDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/madhuri/workspace/2022/JavaFullStack7SepBatch/src/filehandling/testReadOnly.txt";
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Some sensitive information");
        fileWriter.close();
        file.setReadOnly();
    }
}
