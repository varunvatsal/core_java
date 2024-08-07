class VarunException extends Exception {
    public VarunException(String string){
        super(string);
    }
}


public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        //catch block is only executen in case of an exception
        try{
            j = 18/i;
            if(j==0) throw new VarunException("pp");
        }catch(VarunException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero: "+e.getMessage());
        }//block with 'Exception' should be at last otherwise it will give error
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("bye");
    }
}