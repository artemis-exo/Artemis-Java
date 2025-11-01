import java.util.Scanner;
public class calculator_using_Switch {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double a=sc.nextDouble();
        System.out.println("Enter The Second Number");
        double b=sc.nextDouble();
        System.out.println("Enter Operator (*,+,-,/): ");
        char opr=sc.next().charAt(0);
        switch(opr){
            case '*':
                System.out.println("Result: " + (a*b));
                break;
            case '+':
                System.out.println("Result: " + (a+b));
                break;
            case '-':
                System.out.println("Result: " + (a-b));
                break;
            case'/':
                if(b!=0)
                System.out.println("Result: " + (a/b));
                else
                    System.out.println("Cannot divide by Zero");
                break;
            default:
                System.out.println("Invalid operator");

        }

    }
}
