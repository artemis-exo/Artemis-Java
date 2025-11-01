package Static;

public class student_entry {
    public static void main(String[] args) {
        Static_dig student1=new Static_dig();
        Static_dig student2=new Static_dig();
        Static_dig student3=new Static_dig();
        Static_dig student4=new Static_dig();
        Static_dig student5=new Static_dig();
        Static_dig student6=new Static_dig();
        Static_dig student7=new Static_dig();
        System.out.println(Static_dig.count);
        Static_dig.getCount();
        System.out.println(Utils.PI);

        System.out.println(  Utils.max(7,9));
        System.out.println(  Utils.min(7,9));
        System.out.println(Utils.trimAndUpperCase("     vedaant     "));

        School welz= School.getVedaant();
    }
}
