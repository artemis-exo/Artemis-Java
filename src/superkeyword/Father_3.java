package superkeyword;

public class Father_3 {
    Father_3(){
        System.out.println("PARENT CONSTRUCTOR ");
    }
}
class Childo extends Father_3{
    Childo(){
        super();    // CALLS PARENT CONSTRUCTOR  AND  ALWAYS THE 1ST IN CONSTRUCTOR
        System.out.println("CHILD CONSTRUCTOR ");
    }
}
