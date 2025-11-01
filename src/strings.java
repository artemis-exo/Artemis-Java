import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name= new String("VEDAANT");
        System.out.println(name);

        String vamp="VEDAANT";
        System.out.print("THE NAME IS " );
        System.out.println(vamp);

        int a=6;
        float b=5.6588f;
        System.out.printf("The value of a is %d and value of b is %f" , a,b);
        System.out.printf("The value of a is %d and value of b is %.2f" , a,b); // .2 for numbers after decimal
        System.out.printf("The value of a is %d and value of b is %8.2f" , a,b); // .2 for 8 for total spaces.


        Scanner sc=new Scanner(System.in);
        String vtr=sc.next();
         String str = sc.nextLine();
        System.out.println(vtr);
        System.out.print(str);



    }
}
