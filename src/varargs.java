public class varargs {
    public static void main(String[] args) {

        // varargs = allows a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded
        //           java will pack the arguments into an array
        //           ... (ellipsis)
        System.out.println(add(1,2,3,3,4,5));
        System.out.println(average(1,2,3,3,4,5));
        System.out.println(" This is sumie :"+sumie(56,34,89,39,45));
    }
    static int add (int... numbers){
        int sum =0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }
    static double average(double... entries){
         double total=0;
         for(double avg : entries){
             total = total + avg;
         }
         return total/ entries.length;
    }
    public static int sumie(int...r){
     int sum =0;
     for(int gel:r){
         sum+=gel;
     }
     return sum;
    }
}
