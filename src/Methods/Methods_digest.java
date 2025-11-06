package Methods;

public class Methods_digest {
    public static void main(String[] args) {
        int [] a={3,5,7,8,90,4,5};
        sumofArray(a);
        int [] b={34,54,7,82,2390,42,5};
        sumofArray(b);
        String p= "  vedaant   ";
        System.out.println(upperFunc(p));
        System.out.println(Twosum(56,89));
        System.out.println(Twosum(23,56,789));
        System.out.println(Twosum(45.56f,234.24f));
        int x=10;
        int e= multiplyBy10(x);
        System.out.println(e);
        System.out.println(x);
    }
    public static void sumofArray(int [] arr){
        int res=0;
        for(int f : arr){
            res+= f;
        }
        System.out.println(res);
    }
    private static String upperFunc(String str ){
        return str.trim().toUpperCase();
    }
    private static int Twosum(int x , int y){
        return  x+y;
    }
    private static int Twosum(int x , int y,int z){
        return  x+y+z;
    }
    private static float Twosum(float x ,float y){
        return  x+y;
    }
    // MULTIPLY BY 10
    private static int multiplyBy10 (int x){
        return x*10;
    }
}
