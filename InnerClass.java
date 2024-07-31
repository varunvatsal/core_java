class A{
    int age;
    public void show(){
        System.out.println("in A with show");
    }
    class B{
        public void config(){
            System.out.println("in B with config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}

