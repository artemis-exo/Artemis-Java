import java.util.Scanner;
public class recursion {
    // FACTORIAL(0) =1;
    // FACTORIAL(n)= n * n-1 *...1
    // FACTORIAL(5) =5 * 4 * 3 * 2 * 1 =120
    // FACTORIAL(n)= n * factorial(n-1)
    static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("THE NUMBER TO CHECK THE FACTORIAL OF:");
        int p=sc.nextInt();
        System.out.println("THE VALUE OF FACTORIAL n IS: "+factorial(p));
    }
}
