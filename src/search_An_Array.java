import java.util.Scanner;
public class search_An_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] numbers ={4,5,6,8,2,5,6};
        String [] fruits= {"COCONUT", "WATERMELON","APPLE","ORANGE","AVACADO","KIWI"};
        System.out.println("ENTER THE FRUIT NAME TO CHECK: ");
        String check= sc.nextLine();
         int target=12;
         boolean  isFound= false;
         for(int i=0; i< fruits.length; i++){
             if(check.toUpperCase().equals(fruits[i])){
                 System.out.println("THE ENTERED NUMBER IS AT INDEX :"+i);
                 isFound=true;
                 break;
             }
         }
         if(!isFound){ // MAKING IT TRUE TO ENABLE THE CONDITIONAL
             System.out.println("ELEMENT NOT FOUND IN ARRAY");
         }
    }
}
