class Q {
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        if(valueSet){
            try {wait();} catch (InterruptedException e) {}
        }
        System.out.println("Put: "+num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get(){
        if(!valueSet){
            try {wait();} catch (InterruptedException e) {}
        }
        System.out.println("Get: "+num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    Q q;
    public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Consmer");
        t.start();
    }
    public void run(){
        while(true) {
            q.get();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LearnThreads4 {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);   
    }
}
