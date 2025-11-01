import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NO :");
        int a= sc.nextInt();
        System.out.println("ENTER HTE SECOND NUMBER :");
        int b= sc.nextInt();
        // Swapping two numbers
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


    }
}
