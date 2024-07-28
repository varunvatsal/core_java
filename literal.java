public class literal {
    public static void main(String a[]){
        int num1 = 0b101;//  o/p 5 ,binary
        int num2 = 0x7e;//   o/p 126 , hexadecimal
        int num3 = 10_00_000;

        double num4 = 12e10;

        char ch = 'f';
        // ch++;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(ch-'a');
    }
}