import java.util.Scanner;
public class practice_Set_Questions_On_Methods {
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }
    }
    static void Pattern(int x){
        for(int i=1;i<=x;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //sum(n)=1+2+3...+n
    //sum(n)=1+2+3...+n-1 +nz
    //sum(n)= sum(n-1) +n
    //sum(3)= 3+ sum(2)
    //sum(3)= 3+ sum(1)
    static int sumRec(int f){
        //BASE CONDITION
        if(f==1){
            return 1;
        }
        return f + sumRec(f-1);
    }
    static void ReversePattern(int h){
        for(int i=h; i>=1; i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int Fib(int k){
       /* if(k==1){
            return 0;
        }
        else if(k==2){
            return 1;
        } */
        if(k==1 || k==2){ // ABOVE IS SAME OF THIS
            return k-1;
        }
        else{
            return Fib(k-1) + Fib(k-2);
        }
    }
    static double Avg(int... num){
        double sum =0;
        for(double elements:num){
            sum+=elements;
        }
        return sum/ num.length;
    }
    static void Recurve_Pattern(int hox){
        if(hox==0)
            return;
        Recurve_Pattern(hox-1);
        for(int i=0; i<hox; i++){
                System.out.print("*");
        }
        System.out.println();

    }
    static void Reverse_Recurve_Pattern(int fox){
        if(fox==0) {
            return;
        }
        for(int i=0; i<fox; i++){
            System.out.print("*");
        }
        System.out.println();
        Reverse_Recurve_Pattern(fox-1);
    }
    public static void main(String[] args) {
        // PROBLEM 1- MULTIPLICATION TABLE
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO PRINT THE MULTIPLICATION TABLE: ");
        int a=sc.nextInt();
        multiplication(a);  

        // PROBLEM 2- STAR PATTERN
        System.out.println("ENTER THE NUMBER OF ROWS TO DISPLAY PATTERN IN *");
        int b=sc.nextInt();
        Pattern(b);

        // PROBLEM3 - RECURSIVE FUNCTION TO CALCULATE SUM OF FIRST N NATURAL NUMBERS
        System.out.println("ENTER THE N NATURAL NUMBER TO DISPLAY THEIR SUM");
        int c=sc.nextInt();
        System.out.println(sumRec(c));

        // PROBLEM 4- STAR REVERSE PATTERN
        System.out.println("ENTER THE NUMBER OF ROWS TO DISPLAY PATTERN IN *");
        int d=sc.nextInt();
        ReversePattern(d);

        // PROBLEM 5- PRINT THE Nth TERM OF FIBONACCI SERIES
       // FIBONACCI SERIES- 0,1,1,2,3,5,8,13,21,34
        int m=sc.nextInt();
        Fib(m);
        System.out.println(Fib(m));

        //PROBLEM 6- PRINT AVERAGE OF N NUMBERS OF AN ARRAY
        System.out.println("ENTER THE SIZE OF AN ARRAY: ");
        int size =sc.nextInt();
        int [] arr= new int[size];
        System.out.println("THE ELEMENTS OF ARRAY ARE: ");
        for(int i=0; i< size; i++){
            arr[i]= sc.nextInt();
        }

        double r= Avg(arr);
        System.out.println(r);
        //PROBLEM 7 FORWARD PATTERN
        System.out.println("ENTER THE NUMBER OF ROWS:");
        int e=sc.nextInt();
        Recurve_Pattern(e);

        //PROBLEM 8 REVERSE PATTERN
        System.out.println("ENTER THE NUMBER OF ROWS:");
        int f=sc.nextInt();
       Reverse_Recurve_Pattern(f);


    }
}
