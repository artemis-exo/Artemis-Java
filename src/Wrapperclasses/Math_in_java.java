package Wrapperclasses;

public class Math_in_java {
    public static void main(String[] args) {
    int a=222;
    int b=2983;
    int c=-121;
    double d=32.3;
    int e=361;
      // For finding the maximum number
        System.out.println(Math.max(a,b));

        // For finding the minimum number
        System.out.println(Math.min(a,b));

        // For finding the absolute value
        System.out.println(Math.abs(c));

        // For finding the upper value we use ceil function
        System.out.println(Math.ceil(d));

        // For finding the lower value we use floor function
        System.out.println(Math.floor(d));

        // For finding the closest value we use round function  gives output in integer form
        System.out.println(Math.round(d));

        // For finding the square root we use sqrt function  gives output in form of Double
        System.out.println(Math.sqrt(e));

        // For finding the exponential form we use Pow function  gives the output in Double
        System.out.println(Math.pow(12,3));

        // For finding the log
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));

        // For receiving random values we use random  gives value between 0.0 to 1.0
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 11));

        System.out.println(Math.nextAfter(1,2));


        // Has got all predefined functions of all Trigonometric ratios and Value of PI , radians to degree and vice versa

    }
}
