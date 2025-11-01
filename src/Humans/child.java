package Humans;

public class child extends parents{
    public child(int age , String name ){
        super(age , name);  // HERE IT IS CONSTRUCTOR SO IT'S POSITION IS FIXED HERE
        System.out.println("CHILD  CONSTRUCTOR CALLED ");
    }
    public void childMethod(){
        super.parentMethod();    // HERE IT IS NOT CONSTRUCTOR SO IT'S POSITION IS NOT FIXED HERE
        System.out.println("CHILD METHOD CALLED");
    }

}
