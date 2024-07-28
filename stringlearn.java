public class stringlearn {
    public static void main(String[] args) {
        //String name = "varun";
        String name = new String("varun");
        System.out.println(name);
        //both of them are referencing to the same variable 
        String s1 = "Navin";
        String s2 = "Navin";

        StringBuffer sb = new StringBuffer("varun");
        sb.append(" vatsal");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        

    }
}
