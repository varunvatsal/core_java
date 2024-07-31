enum Laptop{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop(){//we use private because objects are getting created in the enum itself
        this.price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}


public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap+" : "+lap.getPrice());
        System.out.println("all laptops with price");
        for(Laptop ele: Laptop.values()){
            System.out.println(ele+" : "+ele.getPrice());
        }
    }
}
