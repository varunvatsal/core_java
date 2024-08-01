public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int num[] = new int[5];
        //catch block is only executen in case of an exception
        try{
            j = 18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero: "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("cannot access index greater than"+
             " or equal to the: "+e.getMessage());
        }//block with 'Exception' should be at last otherwise it will give error
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
