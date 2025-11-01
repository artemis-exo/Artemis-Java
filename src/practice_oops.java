import java.awt.*;

class Employer{
    int Salary;
    String name;

     public int getSalary(){
         return Salary;
     }
     public String getName(){
         return  name;
     }
     public void setName(String n){
          name =n;
     }
     public void setSalary(int s){
         Salary=s;
     }

}
class Cell_phone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Siddhant...");
    }
}

class Square{
    int side ;
    public int Area (){
        return side*side;
    }
    public int Perimeter (){
        return 4* side;
    }
    }

    class Circle{
    int rad;
    public float Area(){
        return 3.14f*rad;
    }
    public float Circumference(){
          return 2*3.14f*rad;
        }
    }
    class Rectangle {
    int a,b;
    public int Area(){
        return a*b;
    }
    public int Perimeter(){
        return 2*(a+b);
    }
    }
public class practice_oops {
    public static void main(String[] args) {
        // PROBLEM 1
        Employer valour= new Employer();
        valour.setName("VEDAANT");
        System.out.println(valour.getName());
        valour.Salary=789;
        System.out.println("Salary is :" +valour.getSalary());

        // PROBLEM 2
        Cell_phone asus = new Cell_phone();
        asus.calling();
        asus.vibrating();
        asus.ringing();

        // PROBLEM 3
        Square sq= new Square();
        sq.side =6;
        System.out.println("AREA OF SQUARE IS: "+sq.Area());
        System.out.println("PERIMETER OF SQUARE IS: "+sq.Perimeter());

        //PROBLEM 4
        Circle point= new Circle();
        point.rad=22;
        System.out.println("AREA OF CIRCLE IS :"+point.Area());
        System.out.println("CIRCUMFERENCE OF CIRCLE IS :"+point.Circumference());

        //PROBLEM 5
        Rectangle rec =new Rectangle();
        rec.a =2;
        rec.b =4;
        System.out.println("AREA OF RECTANGLE IS: "+rec.Area());
        System.out.println("PERIMETER OF RECTANGLE IS: "+rec.Perimeter());




    }
}
