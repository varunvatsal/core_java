class A extends Thread {
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LearnThreads {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        // System.out.println(objA.getPriority());
        objB.setPriority(Thread.MAX_PRIORITY);

        objA.start();
        objB.start();
    }
}
