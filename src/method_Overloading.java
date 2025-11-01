import java.util.Scanner;
public class method_Overloading {
    static int Multiply(int x , int y){  // CHANGING THE RETURN TYPE
        return x*y;
    }
    static double Multiple(double x, double y){ // CHANGING THE RETURN TYPE
        return x*y;
    }
    static int Multiply(int x, int y,int z){
        return x*y*z;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INTERGER VALUE 1 : ");
        int a= sc.nextInt();
        System.out.println("ENTER INTERGER VALUE 2 : ");
        int b=sc.nextInt();
        System.out.println("ENTER DOUBLE VALUE 1 : ");
        double d=sc.nextDouble();
        System.out.println("ENTER INTERGER VALUE 3 : ");
        int c= sc.nextInt();
        System.out.println("ENTER DOUBLE VALUE 2 : ");
        double f=sc.nextDouble();

        System.out.println("MULTIPLY METHOD : RETURN INTEGER : " + Multiply(a,b));
       // System.out.println("MULTIPLY METHOD : RETURN DOUBLE : " + Multiple(d,f));
        System.out.println("MULTIPLY METHOD : RETURN INTEGER 1 : " + Multiply(a,b,c));

    }
}
