import java.io.File;

public class demo05 {
    public static void main(String[] args) {
        File fileObj = new File("demo.txt");
        try {
            if(fileObj.delete()){
                System.out.println(fileObj.getName()+" is deleted");
            }else{
                System.out.println(fileObj.getName()+" does not exists");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
