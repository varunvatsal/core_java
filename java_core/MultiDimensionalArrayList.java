

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<6; i++){
            finalList.add(new ArrayList<Integer>());
            for(int j=0; j<4; j++){
                finalList.get(i).add((int)Math.round(Math.random()*1000));
            }
        }
        for(ArrayList<Integer> a: finalList){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        finalList.get(0).set(0, 69); // how to assign value
        System.out.println();
        for(ArrayList<Integer> a: finalList){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        //how to get the value and an index
        System.out.println(finalList.get(0).get(0));
    }
}