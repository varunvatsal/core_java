// class A implements Runnable {
//     public void run(){
//         for(int i=0; i<5; i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0; i<5; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class LearnThreads2 {
//     public static void main(String[] args) {
//         Runnable objA = new A();
//         Runnable objB = new B();

//         Thread t1 = new Thread(objA);
//         Thread t2 = new Thread(objB);

//         t1.start();
//         t2.start();
//     }
// }
//how to implement above in lamda function


public class LearnThreads2 {
    public static void main(String[] args) {
        Runnable objA = () -> {
                        for(int i=0; i<5; i++){
                            System.out.println("hi");
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    };
        Runnable objB = () -> {
                for(int i=0; i<5; i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

    }
}
