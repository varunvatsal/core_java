class  Human {
    private int age;
    private String name;
    public Human(){ //default constructor
        age=12;
        name="John doe";
    }
    public Human(int a, String b){ // parameterized constructor
        age=a;
        name=b;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human(20, "Neha");
        Human obj1 = new Human(0, null);
        
        int p = obj.getAge();
        System.out.println(p);
    }
}
