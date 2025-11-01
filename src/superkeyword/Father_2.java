package superkeyword;
// CALL PARENT CLASS METHODS
public class Father_2 {
    void display_1(){
        System.out.println("FATHER'S METHOD ");
    }
}

class children extends Father_2{
    void display_1(){
        System.out.println("CHILDREN'S METHOD ");
    }
void show(){
        display_1();    // CHILDREN METHOD
       super.display_1();    // FATHER'S METHOD
}
}

