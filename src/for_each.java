import java.util.Scanner;
public class for_each {
    public static void main(String[] args) {
        int [] makris= {89,98,56,74,85};
        float [] mrakola= {75.7f,58.3f,99.8f,90.2f,39.4f};
//        System.out.println(makris.length);
//        System.out.println(makris[2]);
//        String [] nemo= {"VEDAANT","AMRITA","NIVEDITA","SIDDHANT","PIHU"};
//        System.out.println(nemo[1]);

        // DISPLAYING THE ARRAY FOR LOOP
        System.out.println("PRINTING USING FOR LOOP");
        for(int i=0; i<makris.length; i++){
            System.out.println(makris[i]);
        }
        // DISPLAYING ARRAY IN REVERSE ORDER
        System.out.println("PRINTING USING FOR LOOP IN REVERSE ORDER");
        for(int i=makris.length-1; i>=0; i--){
            System.out.println(makris[i]);
        }
        // DISPLAYING THE ARRAY FOR EACH LOOP
        System.out.println("PRINTING USING FOR EACH LOOP");
        for(int ele : makris){
            System.out.println(ele);
        }

        Scanner sc = new Scanner(System.in);
        String [] foods;
        int size;

        System.out.print("ENTER THE # OF FOOD YOU WANT TO EAT ");
        size= sc.nextInt();
        sc.nextLine();
        foods= new String[size];

        for(int i=0; i< foods.length; i++){
            System.out.print("ENTER A FOOD ITEM ");
            foods[i]=sc.nextLine();
        }
        for(String item : foods){
            System.out.println(item);
        }



    }
}
