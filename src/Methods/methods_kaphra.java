package Methods;

import java.util.Scanner;
public class methods_kaphra {
//    static void printMyName(String name){   // VOID DOES'NT RETURN VALUE OF MAIN FUNCTION
//        System.out.println(name);
//        return;
//    }
//    static int NumSum(int x, int y){
//        int c= x+y;
//        return c;
//    }
//    static int NumProduct(int t, int u){
//        int pro= t*u;
//        return pro;
//    }
    static void PrintFactorial(int n){
        // loop
        int factorial =1;
        for(int i=n ;i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println("THE RESULTANT FACTORIAL IS : " +factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // String name =sc.next();
//        System.out.println("ENTER THE FIRST NUMBER:");
//        int a= sc.nextInt();
//        System.out.println("ENTER THE SECOND NUMBER:");
//        int b=sc.nextInt();
        System.out.println("ENTER THE NUMBER TO FIND THE FACTORIAL OF : ");
        int factoi= sc.nextInt(); // FOR FACTORIAL
        PrintFactorial(factoi);
//        int add= NumSum(a,b);
//        System.out.println("THE SUM OF 2 NUMBERS IS :"+add);
//        int product= NumProduct(a,b);
//        System.out.println("THE PRODUCT OF 2 NUMBERS IS : " +product);
       // printMyName(name);  // call kiya function ko
    }
}
