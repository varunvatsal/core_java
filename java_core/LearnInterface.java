/*
class - class -> extends
class - interface -> implements
interface - interface -> extends
*/
//interface is an alternative to creating an abstract class which has only abstract
//methods 
//every method has public abstract ahead of it by default
interface A {
    int age = 500;//variable are by default final and static thus you have to initialise it
    String city = "Pune";

    void show(); // -> public abstract void show();
    void config();// -> public abstract void config();
}
interface X {
    void run();
}
//you only get methodes in implements not variables
class B implements A, X {
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
    public void run(){
        System.out.println("running...");
    }
}
//interface can also inherit from another interface
interface Y extends X {
    void eat();
}
public class LearnInterface {
    public static void main(String[] args) {
        
        A obj;
        obj = new B();
        obj.show();
        X objX = new B();
        objX.run();
        A obj1 = new A() {
            public void show(){
                System.out.println("show");
            }
            public void config(){
                System.out.println("config");
            }
        };
        obj1.config();

        System.out.println(A.city);//we can access directly because city is static
    }
}
