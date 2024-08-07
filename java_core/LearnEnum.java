
//names constants
enum Status{
    Running, Failed, Pending, Success;
}

public class LearnEnum {
    public static void main(String[] args) {
        Status S = Status.Running;
        System.out.println(S);
        System.out.println(S.ordinal());//this will give index of constant, 0 here
        Status[] ss = Status.values();//.values() will return an array

        for(Status ele: ss){
            System.out.println(ele+" : "+ele.ordinal());
        }
        //if-else
        if(S == Status.Success){
            System.out.println("success achieved");
        }else {
            System.out.println("success not achieved");
        }
        //switch
        Status pp = Status.Pending;
        switch (pp) {
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Success:
                System.out.println("Success");
                break;
            default:
                System.out.println("default");
                break;
        }
    }   
}
