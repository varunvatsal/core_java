import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) {
        File fileObj = new File("demo.txt");
        try {
            fileObj.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileObj, true))){
            bw.write("vivek vishal");
            bw.newLine();
            bw.write("varun vatsal");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
