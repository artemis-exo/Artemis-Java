import java. util. Scanner;
public class Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Float total = 500f;
        System.out.println("Enter marks of Five Subjects");
        System.out.println("Mathematics");
        Float m = sc.nextFloat();
        System.out.println("Physics");
        Float p = sc.nextFloat();
        System.out.println("Chemistry");
        Float c = sc.nextFloat();
        System.out.println("CS");
        Float cs = sc.nextFloat();
        System.out.println("AI");
        Float ai = sc.nextFloat();

        Float sum = m+p+c+cs+ai;
        System.out.println("Your total marks" + sum);
        Float percentage = (sum/total)*100;
        System.out.println("Marks Percentage is" + percentage );



    }
}