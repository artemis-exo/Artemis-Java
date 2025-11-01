package Humans;

public class testor {
    public static void main(String[] args) {
        child ren = new child(10,"kapra");// FIRST GRAND PARENTS CONSTRUCTOR CALLED THEN PARENTS AND THEN CHILD
        System.out.println(ren.getAge());
        System.out.println(ren.getName());
      // System.out.println(ren.HasSuperPowers());
        ren.childMethod();

//            ren.setName("VEDAANT");
//            ren.setAge(21);
//
//        parents par=new parents();    // MULTI-LEVEL INHERITENCE
//        par.setName("ANITA");
//        par.setAge(44);
//        System.out.println(par.getAge());

    }
}
