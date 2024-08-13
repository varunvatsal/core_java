import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class demo03 {
    public static void main(String[] args) {
        // try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        //     osw.write('p');
        //     osw.write('\n');
        //     osw.write("hello world");
        //     osw.write('\n');
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('\n');
        //     char [] arr = "hello world".toCharArray();
        //     osw.write(arr); 

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        File fileObj = new File("demo.txt");
        try {
            fileObj.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //by adding true to the constructor of filewriter write method append and not overwrites
        try (FileWriter fw = new FileWriter("demo.txt", true)){ 
            fw.write("\nvarun vatsal");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
