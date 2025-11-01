import java.util.Scanner;
public class ifelse_practice {
    public static void main(String[] args) {
        // Question 1
//        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1= sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2=sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics ");
//        m3=sc.nextByte();
//        float avg=(m1+m2+m3)/3.0f;
//        System.out.println("Your overall Percentage is:" + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations you have been promoted");
//        }
//        else{
//            System.out.println("Sorry you have not been promoted! Please try again");
//        }

        // Question 2
//        Scanner pc=new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum");
//        float income=pc.nextFloat();
//        float tax=0;
//        if(income<=2.5f){
//            tax=tax + 0;
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax= tax + 0.05f*(income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax= tax + 0.05f*(5.0f-2.5f);
//            tax= tax + 0.2f*(income-5.0f);
//        }
//        else if(income>10.0f ) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The the total tax paid the employee is:" + tax);
//
//        //Question 3
//        int days=sc.nextInt();
//        switch(days){
//            case 1 -> System.out.println("MONDAY");
//            case 2 -> System.out.println("TUESDAY");
//            case 3 -> System.out.println("WEDNESDAY");
//            case 4 -> System.out.println("THURSDAY");
//            case 5 -> System.out.println("FRIDAY");
//            case 6 -> System.out.println("SATURDAY");
//            case 7 -> System.out.println("SUNDAY");
//        }

        //QUESTION 4 leap year
//        System.out.println("Enter the year to check");
//        int year=sc.nextInt();
//        if((year%4==0 && year%100!=0) || (year%400==0)){
//            System.out.println(year + " is a leap year");
//        }
//        else{
//            System.out.println("Year is not leap year");
//        }

        //Question 5
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("This an Organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This an Commercial Website");
        }else if(website.endsWith(".in")){
            System.out.println("This an Indian Website");
        }






    }
}
