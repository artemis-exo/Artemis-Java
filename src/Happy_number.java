import java.util.Scanner;
public class Happy_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int sum =0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r*r;
            n=n/10;

            Happy(sum);
            System.out.println(sum);
        }


    }
    static int Happy(int a){
        if(a==0){
            return 0;
        }
        return ((a%10)^2)+Happy(a/10);
    }
}
