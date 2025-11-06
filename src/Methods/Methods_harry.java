package Methods;

public class Methods_harry {
     static int logic(int x, int y){
        int z;
        x=800; // CHANGES VALUE OF VARIABLE a ONLY FOR TEMPORARY IN WHICH THE FUNCTION IS RECALLED
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=6;
        int b=9;
        int c;
        // METHOD INVOCATION USING OBJECT CREATION (WITHOUT STATIC KEYWORD)
//        Methods.Methods_harry obj= new Methods.Methods_harry();
//        c= obj.logic(a,b);
        c= logic(a,b);
        System.out.println(c);
        System.out.println(a + " " +b);
        int a1=7;
        int b1=4;
        int c1;
//        c1=obj.logic(a1,b1);
        c1= logic(a1,b1);
        System.out.println(c1);
        System.out.println(a1);


    }
}
