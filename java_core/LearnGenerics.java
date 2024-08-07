import java.util.ArrayList;

class Container<T extends Number>{
    private T value;
    public Container(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void demo(ArrayList<? extends T> obj){
        System.out.println("pp");
    }
    public void demo2(ArrayList<? super T> obj){
        System.out.println("pp");
    }
}

public class LearnGenerics {
    public static void main(String[] args) {
        Container<Number> temp = new Container<Number>(10);
        // Container<String> temp2 = new Container<String>("pp");
        System.out.println(temp.getValue());

        temp.demo(new ArrayList<Integer>());
        // temp.demo2(new ArrayList<Integer>());

    }
}
