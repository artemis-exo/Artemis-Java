package Ennum_expe;

public class Main_switch {
    public static void main(String[] args) {

        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY: {
                System.out.println("Today is Monday");
                    break;
            }
            case TUESDAY:{
                System.out.println("Today is Tuesday");
                break;
            }
            default:{
                System.out.println("Weekend ! !");
            }

        }
    }
}
