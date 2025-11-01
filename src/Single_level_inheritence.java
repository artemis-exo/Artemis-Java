class Num {
    public void Addition(int x, int y) {
        int z = x + y;
        System.out.println("The sum of two numbers : " + z);
    }

    public void Subtraction(int e, int h) {
        int v = e - h;
        System.out.println("The difference of two numbers is : " + v);
    }
}
class Numie extends Num{
    public void Multiplication(int q, int d){
        int k=q*d;
        System.out.println("The multiplication of two numbers is :"+k);
    }
    public void Division (int b, int l){
        int m= b/l;
        System.out.println("The division of two numbers is :"+m);
    }
}
public class Single_level_inheritence extends Numie {
    public static void main(String[] args) {
        Numie we=new Numie();
        Single_level_inheritence si=new Single_level_inheritence();
        we.Addition(4,8);
        we.Division(90,15);
        we.Subtraction(15,7);
        we.Multiplication(78,667);
        System.out.println();

        si.Addition(67,89);
        si.Division(80,20);
        si.Multiplication(89,78);
        si.Subtraction(67,34);

    }
}
