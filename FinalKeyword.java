//class made with final keyword can not be inherited
final class A{
    public void show(){
        System.out.println("in A");
    }
    public int add(int a, int b){
        return a+b;
    }
    public static void pp(){
        System.out.println("in staic method of class A");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 8;//const of java
        // num = 9;
        System.out.println(num);

        A obj = new A();
        obj.show();
        System.out.println(obj.add(2, 3));
        System.out.println(add(2, 3));
    }

    static int add(int a, int b){
        System.out.println("in static method add");
        return a+b;
    }
}
