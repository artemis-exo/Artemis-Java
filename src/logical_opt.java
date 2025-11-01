public class logical_opt {
    public static void main(String[] args) {
        System.out.println("FOR LOGICAL OPERATOR AND");
        boolean a = true;
        boolean b = false;
        if(a==true && b==false){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
    }
            if(a && b){
                System.out.println("woo");
            }
            else{
                System.out.println(" nayy");
            }


        System.out.println("FOR LOGICAL OPERATOR OR");
        if(a || b){
            System.out.println("woo");
        }
        else{
            System.out.println(" nayy");
        }

        System.out.println("FOR LOGICAL OPERATOR NOT");
        System.out.println("NOT (A) is ");
        System.out.println(!a);
        System.out.println("NOT (B) is ");
        System.out.println(!b);



    }
}
