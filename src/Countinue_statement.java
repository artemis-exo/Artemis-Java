public class Countinue_statement {
    public static void main(String[] args) {
        // USING FOR LOOP
        for (int i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        // USING WHILE LOOP
        int e=1;
        while (e<=10){
            if(e==5){
                e++;
                continue;

            }
            System.out.println(e);
            e++;
        }


    }
}
