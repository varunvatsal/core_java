
class Mobile {
    String brand;
    int price;
    static String name;//this property will be shared with all the instances of this class
    static{
        name="Phone";
    }
    public Mobile(){
        brand="";
        price=200;
        name="phone";
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    //you can use a static variable inside a static method 
    //you cannot use a non-static variable inside a static method
    public static void show1(Mobile obj){
        System.out.println("static methode");
        System.out.println(obj.brand+" : "+obj.price+" : "+name);

    }
}

public class classAndObject2 {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "samsung";
        obj.price = 12000;
        obj.name = "galaxy 10 pro";
        System.out.println(obj.brand+" : "+obj.price+" : "+obj.name);
        obj.show();
        Mobile.show1(obj);//static methode can be called by using class name

    }
}
