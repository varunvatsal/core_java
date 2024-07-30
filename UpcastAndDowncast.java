class A {
    public void show1(){
        System.out.println("in A show1");
    }
}

class B extends A {
    public void show2(){
        System.out.println("in B show2");
    }
}


public class UpcastAndDowncast {
    public static void main(String[] args) {
        double d = 4.5;
        int i=(int)d;        
        System.out.println(i);
        //can we do above in oops

        //upcasting
        A obj = (A)new B();
        obj.show1();

        //downcating
        B obj1 = (B) obj; 
        obj1.show2();
    }
}
