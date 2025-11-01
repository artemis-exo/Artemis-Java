package Wrapperclasses;

public class Wrapper_classes {
    public static void main(String[] args) {
        int a=1;  // Primitive data type so data will be stored in stack
        Integer b=1;  // Data is stored in Heap as in object b  - This is Autoboxing
        Integer c=Integer.valueOf(1);  // This is the actual form of the above  called Boxing
        boolean hasGraphiccard=true;
        Boolean isAdult =true;  // object created stored in Heap

        Float f=1.2f;
        Double d=1.22;
        Character ch='c';
        Byte bb=1;
        Short sd=2;
        Long l=1231l;

        Integer v=null;  // This can hold null
        int x=0;
        System.out.println(Integer.max(23,89));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(67,2));
        String str="123";
        int i=Integer.valueOf(str);
        System.out.println(i);


    }
}
