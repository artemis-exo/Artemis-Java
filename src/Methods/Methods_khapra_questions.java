package Methods;

import java.util.Scanner;
public class Methods_khapra_questions {
    static int Prime(int x){
        boolean IsPrime= true;
        if(x<=0){
            IsPrime=false;
        }
        else {
            for(int i=2; i<=Math.sqrt(x);i++){
                if(x%i==0){
                    IsPrime=false;
                    break;
                }
            }
        }
        if(IsPrime){
            System.out.println("THE GIVEN NUMBER IS A PRIME NUMBER : " +x);
        }
        else{
            System.out.println("THE GIVEN NUMBER IS NOT PRIME : ");
        }
        return x;
    }
     int Even(int x){
        if(x>0 && x%2==0){
            System.out.print("THE GIVEN NUMBER IS EVEN : ");
        }
        else{
            System.out.print("THE GIVEN NUMBER IS ODD : ");
        }
        return x;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER : ");
        int a= sc.nextInt();
        Methods_khapra_questions sohe= new Methods_khapra_questions();
        int g=sohe.Even(a);
        System.out.println(g);
       // int d= Prime(a);
      // System.out.println(d);

    }
}
