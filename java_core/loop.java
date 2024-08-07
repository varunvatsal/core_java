public class loop{
    public static void main(String args[]){
        // while loop
        int temp=10;
        while(temp>0){
            System.out.println("hello " + temp);
            temp--;
        }

        // do-while
        int i=10;
        do{
            System.out.println("hello " + i);
            i--;
        }while(i>0);//semicolon is imp

        //for loop
        for(int j=0; j<5; j++){
            System.out.println("hello " + j);
        }


    }
}