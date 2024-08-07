public class operator {
    public static void main(String args[]){
        //arithmatic operator
        int num1 = 17, num2 = 10;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2; // will give 1 not 1.7
        int result5 = num1 % num2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        //relational operator
        System.out.println(1>2);//false
        System.out.println(1<2);//true
        System.out.println(1>=2);//false
        System.out.println(1<=2);//true
        System.out.println(1==2);//false
        System.out.println(1!=2);//true

        //logical operator
        System.out.println(true && true);//and
        System.out.println(false || false);//or
        System.out.println(!true);//not
        

    }
}
