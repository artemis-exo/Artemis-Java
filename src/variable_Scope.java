public class variable_Scope {
    static int x=3; // CLASS VARIABLE
    public static void main(String[] args) {
        int x=1;  // LOCAL VARIABLE
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x=2;
        System.out.println(x);
    }
}
