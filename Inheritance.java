class Mobile{
    public int weight;
    public int price;
    public String type;
    public String os;

    public Mobile(int weight, int price, String type, String os){
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.os = os;
    }

    public void show(){
        System.out.println("Type: " + this.type);
    }
}

class iphone extends Mobile{

    String camera;

    public iphone(int weight, int price, String type, String os, String camera){
        super(weight, price, type, os);
        this.camera = camera;
    }

    public void show(){
        super.show();
        System.err.println("camera: "+this.camera);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        iphone myMobile = new iphone(100, 35000, "s10", "macOS", "10MP");
        myMobile.show();

    }
}
