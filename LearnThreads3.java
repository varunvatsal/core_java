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

        t1.setName("Thread name: Hi");
        t2.setName("Tread name: Hello");
        System.out.println(t1.getName());;
        System.out.println(t2.getName());;
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());//return true if thread is still running
        System.out.println(t2.isAlive());//false otherwi
       
        System.out.println(c.cnt);

    }
}