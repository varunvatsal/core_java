public class conditionalStat{
    public static void main(String args[]){
        //if {} else{}
        int x=10;
        if(x==10){//executes on true
            System.out.println("pp");
        }else {
            System.out.println("not pp");
        }

        //if{} else if{} else{}
        int y=13;
        if(y<10){
            System.out.println("less than 10");
        }else if(y<15){
            System.out.println("greater than 10 and less than 15");
        }else{
            System.out.println("greater than 15");
        }
        //ternary operator
        int k=24;
        System.out.println(k%2==0 ? "even" : "odd");

        //switch statemant
        int n=1;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday"); 
                break;
            default: 
                System.out.println("Enter a valid number");
        }

        //new switch statement, no break statement
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("7am");
            default -> System.out.println("8am");
        }


        String month = "january";
        String result = "";
        result = switch(month){
            case "august", "september" -> "6am";
            case "january" -> "7am";
            default -> "8am";
        };
        System.out.println(result);
        //does the same thing as above 
        // String month = "january";
        // String result = "";
        // result = switch(month){
        //     case "august", "september": yield "6am";
        //     case "january": yield "7am";
        //     default: yield "8am";
        // };
        // System.out.println(result);


    }
}