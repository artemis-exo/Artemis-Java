package Ennum_expe;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dayclass.MONDAY);
        System.out.println(Dayclass.MONDAY);
        System.out.println(Dayclass.MONDAY);
        System.out.println(Dayclass.MONDAY);
        System.out.println(Dayclass.SUNDAY);
        System.out.println(Dayclass.SATURDAY);
        System.out.println(Dayclass.TUESDAY);
        System.out.println(Dayclass.THURSDAY);

        // Print using Ennum
        System.out.println(Day.FRIDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.TUESDAY);

        Day mon=Day.MONDAY;
        int ordinal =mon.ordinal();
        System.out.println(ordinal);
        System.out.println(mon.name());

       Day ennumDay= Day.valueOf("WEDNESDAY");  // Check whether it is present or not
        System.out.println(ennumDay);
        Day[] values=Day.values();
        for(Day i: values){
            System.out.println(i);
        }
        Day tue=Day.TUESDAY;
        mon.display();
        tue.display();
    }
}
