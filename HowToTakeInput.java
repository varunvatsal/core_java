// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class HowToTakeInput {
    public static void main(String[] args) throws IOException{
        int temp;
        System.out.print("Enter a number: ");
        
        // temp = System.in.read();//this will give ascii value
        
        //buffer
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // temp = Integer.parseInt(bf.readLine());

        //scanner
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        System.out.print("number that you inputed: ");
        System.out.println(temp);
        sc.close();

        // bf.close();
    }
}
