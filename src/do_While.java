import java.util.Scanner;
public class do_While {
    public static void main(String[] args) {
//        int a=10;
//        do{
//            System.out.println(a);
//            a++;
//        } while(a<5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n natural numbers");
        int dop= sc.nextInt();
        int ik=1;

        do {     // For n Natural Numbers
            System.out.println(ik);
            ik++;
        } while(ik<=dop);

    }
}
