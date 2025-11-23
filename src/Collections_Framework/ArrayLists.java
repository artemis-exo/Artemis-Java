package Collections_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(1);
        List.add(5);
        List.add(80);
        List.add(90);
        System.out.println(List.get(3));
        System.out.println(List.size());
        // To print the Array list
        for(int i=0; i<List.size();i++){
            System.out.println(List.get(i));
        }
        List<String> list=new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> List1= Arrays.asList("Monday","Tuesday");
        System.out.println(List1.getClass().getName());
        List1.set(1,"Wednesday");
        System.out.println(List1.get(1));


        String[] array={"Apple","Banana","Cherry"};
        List<String>list2= Arrays.asList(array);
        System.out.println(list2.getClass().getName());
        list2.set(1,"Cherry");
        System.out.println(list2.get(1));

        // We are allowed to this in this because it is not asList
        List<String> list3=new ArrayList<>(list2);
        list3.add("Mango");
        System.out.println(list3);

        List<Integer> list4=new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(0,0);
       // System.out.println(list4);

        List<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Date");

        fruits.remove("Apple");
        System.out.println(fruits);

        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        num.remove(Integer.valueOf(1));
        System.out.println(num);

        Object[] array1=num.toArray();
       Integer[] array2= num.toArray(new Integer[0]);

    // For sorting the Array List
       List<Integer> nums=new ArrayList<>();
       nums.add(67);
       nums.add(34);
       nums.add(99);
       nums.add(21);

        Collections.sort(nums);
        // can use list.sort() too
        System.out.println(nums);



    }

}
