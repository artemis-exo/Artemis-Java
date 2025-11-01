package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
      //  System.out.println(sum(Arrays.asList(1,2.2,2,22)));

    }
    public <T> T getFirst(ArrayList<T>List){
        return List.get(0);
        }
        public <T> void copy(ArrayList<T>source, ArrayList<T> destination){
        for(T item : source){
            destination.add(item);
        }
        }

        public static double sum (ArrayList<? extends Number>numbers){
        double sum=0;
        for(Number o: numbers){
            sum+=o.doubleValue();
        }
        return  sum;
        }
    }

