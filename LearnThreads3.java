class Counter{
    int cnt=0;
    public synchronized void increment(){
        cnt++;
    }
}

public class LearnThreads3 {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable objA = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        Runnable objB = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
       
        System.out.println(c.cnt);

    }
}