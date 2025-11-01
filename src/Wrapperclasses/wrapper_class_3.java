package Wrapperclasses;

public class wrapper_class_3 {
    public static void main(String[] args) {
        Integer b=1;
        Integer c=1;
        System.out.println(b.equals(c));  // We can use this method to check the equality because b & c are objects
        fun(b);
        System.out.println(b);
    }
    private static void fun(Integer a){
        a=2;
    }
}
