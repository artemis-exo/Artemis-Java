import java.util.Scanner;
public class Prime_check {
    static boolean Primoo(int h){
        int res=0;  
        for(int i=1; i<h/2; i++){
            if(h % i==0){
                res++;
            }
        }
        return res==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int v=sc.nextInt();
        System.out.println(Primoo(v));

        System.out.println(Primoo(45));
        System.out.println(Primoo(13));
        System.out.println(Primoo(67));

    }
}
