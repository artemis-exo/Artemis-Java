package superkeyword;
// ACCESS PARENT CLASS VARIABLE (WHEN CHILD CLASS HAS SAME NAME VARIABLE )
public class Father {
    int numi =100;
}
class Children extends Father{
    int num =120;

    void show(){
        System.out.println(num);  // PRINT 120 (CHILDREN'S VARIABLE)
        System.out.println(super.numi);  // PRINT 100 (FATHER'S VARIABLE)
    }
}
