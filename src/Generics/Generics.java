package Generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        int [] arr=new int[5];
        ArrayList <String>list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
         String s=list.get(1);
        String x=list.get(0);
        System.out.println(x);

//         String str = (String) list.get(0);
//         String integer=(String)list.get(1);
    }
}
