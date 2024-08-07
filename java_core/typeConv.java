public class typeConv {
    public static void main(String args[]){
        byte bt = 125;
        int a=123;
        //explicit conversion -> casting
        //in case value in a is greater than the range of byte it will store moduleo with range
        //so if a had 257 in it, then b will have 257%256 = 1 in it
        bt = (byte)a;
        //implicit conversion
        //a=b; 
        System.out.println(bt);

        float fl = 5.6f;
        int a2;
        //casting
        a2 = (int)fl;
        System.out.println(a2);

        //type promotion
        byte a3 = 10;
        byte b = 30;
        int result = a3*b;//java will automatically convert byte to int for you so that you dont lose data
        System.out.println(result);
    }
}