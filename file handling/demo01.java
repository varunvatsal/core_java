import java.io.IOException;
import java.io.InputStreamReader;

public class demo01 {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            // InputStreamReader isr = new InputStreamReader(System.in);
            System.out.print("please enter some charecters: ");
            int letter = isr.read();
            while(isr.ready()){
                System.out.print((char)letter);
                letter = isr.read();
            }
            // isr.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
