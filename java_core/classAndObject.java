class Student {
    int rollno;
    String name;
    int marks;
}
class Computer {
    public void playMusic(){
        System.out.println("Music playing");
    }

    public String getMePen(int cost){
        if(cost >= 10){
            return "Pen";
        }
        return "Nothing";
    }
}

class Calculator{
    int temp=10;
    public int add(int a, int b){
        return a+b;
    }
    //methode overloading
    //return type doesnt matter, no. of parameter and type of parameter matters
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(int a, double b){
        return a+b;
    }
}

public class classAndObject{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println(calc.temp);
        System.out.println(result);

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMePen(10));


        Student rahul = new Student();
        rahul.rollno = 7845;
        rahul.name = "rahul";
        rahul.marks = 25;
        Student priti = new Student();
        priti.rollno = 7845;
        priti.name = "priti";
        priti.marks = 25;
        //array of objects
        Student student[] = new Student[2];//this does not return 2 objects but 
        //a variable that can store the refrence to that type of objects 
        student[0] = rahul;
        student[1] = priti;
    }
}