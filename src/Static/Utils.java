package Static;

public class  Utils {

    public static final double PI;  // Cannot assign values to final variable
static {
    PI=3.14159;  // PI can be initialized inside static also, And class initializer is not allowed in Interface
}

    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public static String trimAndUpperCase(String str){
        if(str!=null){
           return str.trim().toUpperCase();
        }
        else{
            return "";
        }
    }
}
