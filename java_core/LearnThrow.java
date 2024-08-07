public class LearnThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0) throw new ArithmeticException("j value was assigned zero, so i gave it default value");
        }catch(ArithmeticException e){
            // System.out.println("Cannot divide by zero: "+e.getMessage());
            j = 18/1;
            System.out.println("intialising 'j' with default output: "+e.getMessage());
        }catch(Exception e){
            System.out.println("something went wrong: "+e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
