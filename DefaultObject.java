class laptop{
    String brand;
    int price; 

    public String toString(){
        return "model : "+brand + "\n" +"price : "+ price;
    }public boolean equals(laptop that){
        return (this.brand == that.brand) && (this.price == that.price);
    }
}

public class DefaultObject {
    public static void main(String[] args) {
        laptop obj = new laptop();    
        obj.brand = "macbook air";
        obj.price = 1000;
        System.out.println(obj);

        laptop obj2 = new laptop();    
        obj2.brand = "macbook air1";
        obj2.price = 1000;
        System.out.println(obj);

        boolean result = (obj.equals(obj2));
        System.out.println(result);
    }
}
