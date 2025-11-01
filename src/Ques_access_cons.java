class Cylinder {
    private int  radius;
    private int  height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI* radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
  class  Rectangl{
    private  int length;
    private int breadth;

      public Rectangl() {
          this.length = 4;
          this.breadth = 5;
      }

      public Rectangl(int length, int breadth) {  // Customized Constructor
          this.length = length;
          this.breadth = breadth;
      }

      public int getLength() {
          return length;
      }

      public int getBreadth() {
          return breadth;
      }
  }
   class Sphere {
    private double radii;

       public double getRadii() {
           return radii;
       }

       public void setRadii(double radii) {
           this.radii = radii;
       }
       public double SurfArea(){
           return 4*Math.PI*radii*radii;
       }
       public double Vol(){
           return (4*Math.PI*radii*radii*radii)/3;
       }
   }
public class Ques_access_cons {
    public static void main(String[] args) {
        //PROBLEM 1
       /* Cylinder Lpg=new Cylinder();
        Lpg.setRadius(9);
        Lpg.setHeight(12);
        System.out.println(Lpg.getRadius());
        System.out.println(Lpg.getHeight());

        //PROBLEM 2
        double d=Lpg.surfaceArea();  // SURFACE AREA
        System.out.println(d);
        double r=Lpg.volume();  // VOLUME
        System.out.println(r);*/

    /*    //PROBLEM 3
        Cylinder Lpg_2=new Cylinder(12,9);
        System.out.println(Lpg_2.getRadius());
        System.out.println(Lpg_2.getHeight());*/

      /*  // PROBLEM 4
        Rectangl r=new Rectangl(12,56);  // This customized constructor
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());*/

        // PROBLEM 5
        Sphere s=new Sphere();
        s.setRadii(4.5);
        System.out.println(s.getRadii());
        System.out.println(s.SurfArea());
        System.out.println(s.Vol());

    }
}
