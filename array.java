public class array{
    public static void main(String args[]){
        int num[] = {1, 2, 3};
        num[0] = 8;
        for(int i=0; i<3; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        int num2[] = new int[4];//every position will have '0'
        for(int i=0; i<num2.length; i++){
            System.out.print(num2[i]+ " ");
        }
        System.out.println();
        //multi-dimensional array
        int nums3[][] = new int[5][5];
        //how to get random value in java
        // (int)(Math.random() * 100); //Math.random() return a double within 0 to 1 not including 1
        for(int i=0; i<nums3.length; i++){
            for(int j=0; j<nums3[0].length; j++){
                nums3[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println();
        System.out.println("normal for loop");
        System.out.println();
        for(int i=0; i<nums3.length; i++){
            for(int j=0; j<nums3[0].length; j++){
                System.out.print(nums3[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("enhanced for loop");
        System.out.println();
        //enhanced for loop
        for(int n[]: nums3){
            for(int m: n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("jagged array");
        System.out.println();
        
        //jagged array
        int nums4[][] = new int[3][];
        nums4[0] = new int[3];
        nums4[1] = new int[4];
        nums4[2] = new int[2];

        for(int i=0; i<nums4.length; i++){
            for(int j=0; j<nums4[i].length; j++){
                nums4[i][j] = (int)(Math.random()*100);
            }
        }
        for(int n[]: nums4){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}