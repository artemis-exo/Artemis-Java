import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("It's your choice\nPlease choose your number ");
       Random ram=new Random();
        int your_inp , comp_inp;
        int i=1;
        while(i<=4){
            your_inp=sc.nextInt(3);
            comp_inp=ram.nextInt(3);
            System.out.println("You choosed:");

            switch(your_inp){
                case 0:
                    System.out.println("Rock");
                    break;

                case 1:
                    System.out.println("Paper");
                    break;

                case 2:
                    System.out.println("Scissor");
                    break;
            }
            System.out.println("Computer choosed:");

            if(comp_inp==0) {
                System.out.println("Rock");
            }
                else if(comp_inp==1){
                System.out.println("Paper");
            }
                else if(comp_inp==2){
                System.out.println("Scissor");
            }
            System.out.println("Here is your Winner:");
                if(your_inp==0 && comp_inp==1){
                    System.out.println("Oops the computer Won, Better luck next time:");
                }
                    else if(your_inp==1 && comp_inp==2){
                    System.out.println("Oops the computer Won, Better luck next time:");
                }
                    else if(your_inp==2 && comp_inp==0){
                    System.out.println("Oops the computer Won, Better luck next time:");
                }
                    else if(your_inp==0 && comp_inp==2){
                    System.out.println("Congratulations You Won:");
                }
                    else if(your_inp==1 && comp_inp==0){
                    System.out.println("Congratulations You Won:");
                }
                    else if(your_inp==2 && comp_inp==1){
                    System.out.println("Congratulations You Won:");
                }
                    else if(your_inp==comp_inp){
                    System.out.println("Sorry the match is drawn, Please try again");
                }
                    i++;


        }


    }
}
