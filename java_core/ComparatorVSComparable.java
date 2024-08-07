import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>{
    public int age;
    public String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
  
    public int compareTo(Student that) {
        if(this.age>that.age) return -1;
        return 1;
    }   
    
}


public class ComparatorVSComparable {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a%10 > b%10) return 1;
                return -1;
            }
        };

        List<Integer> tempList = new ArrayList<>();
        tempList.add(43);
        tempList.add(32);
        tempList.add(55);
        tempList.add(70);

        Collections.sort(tempList, comp);

        System.out.println(tempList);

        Comparator<Student> comp1 = new Comparator<Student>() {
            public int compare(Student a, Student b){
                return a.age>b.age?-1:1;
            }
        };
        List<Student> stds = new ArrayList<>();
        stds.add(new Student(20, "varun"));
        stds.add(new Student(21, "saket"));
        stds.add(new Student(27, "rohan"));
        stds.add(new Student(28, "vivek"));
        Collections.sort(stds, comp1);
        // Collections.sort(stds);

        for(Student ele: stds){
            System.out.println(ele);
        }
    }
}
