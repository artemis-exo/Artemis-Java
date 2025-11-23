package Inheritence;

class base{
    base(){
        System.out.println("Iam a constructor ");
    }
    base(int a){
        System.out.println("Iam an overloaded constructor with value of x as "+a);
    }
}
class Derived extends base{
    Derived(){
        super(0);    // DISPLAYS DERIVED CLASS CONSTRUCTOR
        System.out.println("Iam a derived class constructor ");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("Iam an overloaded constructor of derived with value of y as "+y);
    }
}
class ChildofDerived extends Derived{
    ChildofDerived(){
        System.out.println("I am a Child of derived constructor ");
    }
    ChildofDerived(int x, int y, int z){
        super(x,y);
        System.out.println("Iam an overloaded constructor of derived with value of z as "+z);
    }
}


public class Inherit_cons_hy {
    public static void main(String[] args) {
      //  Inheritence.base b=new Inheritence.base();
       // Inheritence.Derived d=new Inheritence.Derived();
        //Inheritence.Derived r=new Inheritence.Derived(4,7);
        ChildofDerived chd=new ChildofDerived(12,14,16);
    }
}
