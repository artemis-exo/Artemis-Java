import java.util.Scanner;
public class practice_on_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // SUM OF FIRST N EVEN NUMBERS USING WHILE LOOP
//        int n=sc.nextInt();
//        int i=1;
//        int sum =0;
//        while(i<=n){
//            sum= sum + 2*i;
//            i++;
//        }
//        System.out.print("Sum of Even numbers is:");
//        System.out.println(sum);

        //OR
//        int p=sc.nextInt();
//        int u=0;
//        int addie=0;
//        int numero=2;
//        while(u<p){
//            addie=addie+numero;
//            numero= numero+2;
//            u++;
//        }
//        System.out.print("Sum of Even numbers is:");
//        System.out.println(addie);

        // Multiplication table of a given number N
        //       System.out.println("Enter the Desired number of multiplication table");
//        int m=sc.nextInt();
//        for(int e=1; e<=10;e++){
//            System.out.println(m*e);
//        }
        // From while loop
//        System.out.println("Enter the Desired number of multiplication table");
//        int yu=sc.nextInt();
//        int b=1;
//        while(b<=10){
//            System.out.println(yu*b);
//            b++;
//
//        }

        // Reverse order multiplication of 10
//        int v=10;
//        for(int f=10; f>=1;f--){
//            System.out.println(v*f);
//        }
        // FROM WHILE LOOP
//        int w=10;
//        int g=10;
//        while(w>=1){
//            System.out.println(g*w);
//            w--;
//        }
        // FACTORIAL OF A GIVEN NUMBER USING FOR LOOP
//        System.out.println("Enter the Desired number to find Factorial");
//        int x=sc.nextInt();
//        int sumie=1;
//        for(int h=1; h<=x;h++){
//            sumie= sumie*h;
//        }
//        System.out.println(sumie);

//        // FACTORIAL OF A GIVEN NUMBER USING WHILE LOOP
//       System.out.println("Enter the Desired number to find Factorial");
//        int z=sc.nextInt();
//        int c=1;
//        int q=1;
//        while(c<=z){
//            q=q*c;
//            c++;
//        }
//        System.out.println(q);
        // MULTIPLICATION AND ADDITION OF TABLE OF 8 - Give input 8
//        int p=sc.nextInt();
//        int yolo=0;
//       for(int l=1; l<=10;l++) {
//           System.out.println(p * l);
//           yolo= yolo+p*l;
//       }
//        System.out.println("THE ADDITION OF MULTIPLICATION OF 8 is: " + yolo);

       //   1 USING FOR LOOP
        int numeric= sc.nextInt();
        int himp=0;
        for(int d=1; d<=numeric; d++){
            himp= himp+ 2*d;
        }
        System.out.println("THE SUM OF N EVEN NUMBERS IS : "+himp);

    }

}
