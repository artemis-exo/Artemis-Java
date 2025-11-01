package Access_modifier.school;

public class Student {
    public String name;

    public int age;

    private Student(){

    }

    public void sayHello(){
        System.out.println("HELLO");
    }
     public static void sayBye(){
         System.out.println("BYE..");
     }
}
