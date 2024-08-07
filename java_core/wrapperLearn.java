public class wrapperLearn {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;//autoboxing

        int num2 = num1.intValue(); //unboxing
        int num3 = num1;//autounboxing
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
