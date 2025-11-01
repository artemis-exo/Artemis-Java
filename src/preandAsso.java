import java.sql.SQLOutput;
import java.util.Scanner;
public class preandAsso {
    public static void main(String[] args){
        // Precedence & Associativity
        //int a = 6*5-34/2;
        /*
        Highest precedence goes to* & / . They are then evaluated on the basis of left to right associativity
           30-34/2
           30-17
           =13
        */
     //   int b = 60/5-34*2;
        /*
           12-34*2
           12-68
           -56
         */
      //  System.out.println(a);
       // System.out.println(b);
        //a = b=67;
        // They are evaluated on the basis of right to left

        // Quick Quiz
// 1
//        int c = 8;
//        int u = 2;
//        int h = c*u/2;
//        System.out.println(h);

        // 2
//        int r = 1;
//        int j = 4;
//        int m = 5;
//        int o = (r*r-4*j*m)/(2*m);
//        System.out.println(o);
        //3
//        int l = 4;
//        int f = 9;
//        int x = l*l-f*f;
//        System.out.println(x);
        // 4
//        int p = 2;
//        int i = 7;
//        int r = 1;
//        int q = p*i-r;
//        System.out.println(q);

        // 5
//        int v= 4;
//        int u= 2;
//        int e= 6;
//        int q= 8;
//        float k= (float)(v*v-u*u)/(2*e*q);
//        System.out.println(k);

        //6
        char grade= 'B';
        grade= (char)(grade+8);
        System.out.println(grade);

        // Decrypting
        grade= (char)(grade-8);
        System.out.println(grade);

        //6
        Scanner sc= new Scanner(System.in);
        int y= sc.nextInt();
        System.out.println(y>9);








    }
}
