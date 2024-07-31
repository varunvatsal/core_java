@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class LearnFunctionalInterface2 {
    public static void main(String[] args) {
        // A obj = new A() {
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // A obj = (int i, int j) -> 
        //     {
        //         return i+j;
        //     };

        // A obj = (int i, int j) -> i+j;
        A obj = (i, j) -> i+j;
        int result = obj.add(2, 3);
        System.out.println("result: "+result);
    }
}
