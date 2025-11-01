public class varargs_harry {
    public static void main(String[] args) {
        System.out.println("WELCOME TO VARARGS TUTORIAL");
        System.out.println("THE SUM OF 4 & 5 IS :"+sum(4,5));
        System.out.println("THE SUM OF 4,3 & 5 IS :"+sum(4,3,5));
        System.out.println("THE SUM OF 4,3,6 & 5 IS :"+sum(4,3,6,5));
        System.out.println("THE SUM OF NOTHING IS :"+sum(1));
    }
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b,int c) {
//        return a + b + c;
//    }
//    static int sum(int...arr){
//        // AVAILABLE AS INT[] arr;
//        int add=0;
//        for(int element : arr){
//            add+=element;
//        }
//          return add;
//    }
    static int sum(int x,int...arr){ // X BECOMES MANDATORY SO WE HAVE TO PASS ATLEAST ONE VALUE IN MAIN METHOD
        // AVAILABLE AS INT[] arr;
        int add=x;
        for(int element : arr){
            add+=element;
        }
        return add;
    }
}
