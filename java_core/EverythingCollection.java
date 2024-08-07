import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EverythingCollection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(0);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        // System.out.println(nums);
        //index doesnt work in Collection, so use List
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(6);
        nums1.add(5);
        nums1.add(7);
        nums1.add(0);
        System.out.println();
        System.out.println("ArrayList");
        for(int ele: nums1){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(nums1.get(0));

        //order of entry is not maintained
        //collection of unique values
        Set<Integer> TempSet = new HashSet<Integer>();
        TempSet.add(62);
        TempSet.add(54);
        TempSet.add(82);
        TempSet.add(21);
        TempSet.add(62);
        System.out.println("set");
        for(int ele: TempSet){
            System.out.print(ele+" ");
        }
        System.out.println();
        //set but stored in ordered(asc) way
        Set<Integer> TempSet1 = new TreeSet<Integer>();
        TempSet1.add(62);
        TempSet1.add(54);
        TempSet1.add(82);
        TempSet1.add(21);
        TempSet1.add(62);
        System.out.println("TreeSet");
        for(int ele: TempSet1){
            System.out.print(ele+" ");
        }
        System.out.println();

        //map(key - value)
        Map<String, Integer> tempMap = new HashMap<String, Integer>();
        tempMap.put("varun", 1000);
        tempMap.put("navin", 1500);
        tempMap.put("saket", 1200);
        tempMap.put("trump", 10000);
        tempMap.put("varun", 1200);
        System.out.println("HashMap");
        // System.out.println(tempMap.get("varun"));
        for(String key: tempMap.keySet()){
            System.out.println(key+" : "+tempMap.get(key));
        }


    }
}

//collection API - concept
//Collection - interface
//Colections - class