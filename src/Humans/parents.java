package Humans;

public class parents extends grandparents{
    public parents(int age , String name ){
        super(age, name);
        System.out.println("PARENTS CONSTRUCTOR CALLED ");
        }
        public void parentMethod(){
            System.out.println("PARENT METHOD CALL ");
    }
}
