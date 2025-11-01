package Generics;

public class Methods {
    public static void main(String[] args) {
        Methods meth=new Methods();
        int a=326862;
        Integer[] intArray={1,2,3,4};
        String[] stringArray={"Hello","World"};
        meth.printArray(intArray);
        meth.printArray(stringArray);
        meth.display(stringArray);
        meth.display(a);
    }
    public <T> void printArray(T[] array){
        for(T ele:array){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public <T> void display(T elements){
        System.out.println("Generic display: "+elements);
    }
    public void display(Integer elements){
        System.out.println("Inetger display: "+elements);
    }
}
