import java.util.Scanner;
public class logical_switch {
    public static void main(String[] args) {
        int age;
        char var;
        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        var= 'y';
       // age=sc.nextInt();

        switch(var) {
            case 'r':
                System.out.println("You are going to become an adult");
                break;
            case 'p':
                System.out.println("You are going to join a job");
                break;
            case 'm' :
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }



//        switch(age) {
//            case 21:
//                System.out.println("You are going to become an adult");
//                break;
//            case 32:
//                System.out.println("You are going to join a job");
//                break;
//            case 46:
//                System.out.println("You are going to get retired");
//                break;
//            default:
//                System.out.println("Enjoy your life");
//        }










//        if(age>56){
//            System.out.println("You are experienced ");
//        }
//        else if(age>44){
//            System.out.println("You are semi-experienced");
//        }
//        else if(age>32){
//            System.out.println("You are semi-semi experienced");
//        }
//        else{
//            System.out.println("You are not experienced");
//        }
    }
}
