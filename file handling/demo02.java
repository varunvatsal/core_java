import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Risk of Developing or Dying From Cancer.csv"))){
            // BufferedReader br = new BufferedReader(new FileReader("Risk of Developing or Dying From Cancer.csv"));
            String line = br.readLine();
            while (br.ready()) {
                System.out.println(line);
                line = br.readLine();
            }
            // br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
