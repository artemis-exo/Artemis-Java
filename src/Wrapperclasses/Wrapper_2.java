package Wrapperclasses;

public class Wrapper_2 {
    public static void main(String[] args) {
        Studentzz x=new Studentzz();
        x.id=1;
        fun(x);
        System.out.println(x.id);  // The value will not change so x.id will be 1

    }
    private static void fun(Studentzz a){
        Studentzz student=new Studentzz();
        student .id=2;  // But if we change it to a.id=2;  The output will be 2 in main function
        a=student;
    }
}
class Studentzz{
    public int id;
}
