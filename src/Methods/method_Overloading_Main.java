package Methods;

public class method_Overloading_Main {
    static void Foe(){
        System.out.println("GOOD MORNING VRO! ");
    }
    static void Foe(int y){
        System.out.println("GOOD MORNING " +y +" VRO! ");
    }
    static void Foe(int y, int z){
        System.out.println("GOOD MORNING " +y +" VRO! ");
        System.out.println("GOOD MORNING " +z +" VRO! ");
    }
    static void Change2(int [] arr){ // DOESN'T COPY VARIABLE IT USED AS A REFERENCE IN ARRAY
        arr[0]=44;
    }
    static void Change(int x){  // IF DATA TYPE INT IS USED THEN THE UPDATED VALUE OF a WILL BE 500
        x=500;
    }
    static void tellJoke(){
        System.out.println("I INVENTED A NEW WORD\n" + "PLAGIARISM ");
    }
    public static void main(String[] args) {
        tellJoke();
        // CASE 1 : CHANGING INTEGERS
        int a= 66;
         Change(a);  // Cannot store in INT because of void
        System.out.println("THE VALUE OF a AFTER RUNNING CHANGE : " +a);

        //  CHANGING IN ARRAY
        int [] marks={56,99,67,88,86};
        Change2(marks);
        System.out.println("THE VALUE OF marks AFTER RUNNING CHANGE : " +marks[0]);

        // METHOD OVERLOADING
        Foe();
        Foe(6046);
        Foe(604,4064);  //ONLY TAKES THE VALUE OF THIS RECALL NOT OF OTHERS VARIABLE


    }

}
