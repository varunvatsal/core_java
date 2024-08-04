import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        

        List<Integer> tempList = Arrays.asList(4, 3, 7, 6, 5, 8, 10);
        System.out.println("normal print");
        tempList.forEach(ele -> System.err.print(ele+" "));
        System.out.println();
        //stream can only be used once 
        // Stream<Integer> st = tempList.stream(); 
        // Stream<Integer> st1 = st.filter(ele -> ele%2==0);
        // Stream<Integer> st2 = st1.map(ele -> ele*2);
        // int result = st2.reduce(0, (c, e) -> c+e);
        // System.out.println("stream print after filter, map and reduce");
        // System.out.println(result);
        // st2.forEach(ele -> System.out.print(ele+" "));

        int result = tempList
                    .stream()
                    .filter(ele -> ele%2==0)
                    .map(ele -> ele*2)
                    .reduce(0, (c,e) -> c+e);

        System.out.println(result);

    }
}
