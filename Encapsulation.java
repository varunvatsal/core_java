class  Human {
    private int age;
    private String name;
    public Human(int a, String b){
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
        
        int p = obj.getAge();
    }
}
