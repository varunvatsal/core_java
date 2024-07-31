
//can not create an object of an abstract class
//only an abstract class can have an abstract method
//it isn't required that an abstract class must have an abstract method
//you have to define all the abstract methods in the inherited class, if you dont then you have to make the child class abstract.   
abstract class Car {
    public abstract void drive();
    // public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }
}

class WagonR extends Car{
    public String Model = "S12";
    public void drive(){
        System.out.println("Driving...");
    }
    public void Break(){
        System.out.println("breaking....");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        // obj.Break(); ->because our object is of type car, this line will give err
        //obj.Model; obj is of type car which does not have a attribte car

    }
}
