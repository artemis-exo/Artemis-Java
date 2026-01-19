package Collections_Framework;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        // Streams
        // Java 8 ---> minimal code ,functional programming
        // Java 8 ---> lambda expression, Streams, Date & Time API

        // lambda expression
        // lamba expression is an anonymous function (no name, no return type, no access modifier)

        Thread t1=new Thread(() -> {
            System.out.println("Hello");
        });
        MathOperation sumOperation=( a,  b)-> a+b;
        MathOperation subtractOperation=(a,b)->a-b;
        int res=sumOperation.operate(1,2);
        System.out.println(res);

        // Predicate --> Functional Interface(Boolean values functions)
        Predicate<Integer>isEven =x ->x%2==0;
        System.out.println(isEven.test(37823));

        Predicate<String>isWordStartingWithV =x->x.toLowerCase().startsWith("v");
        System.out.println(isWordStartingWithV.test("Vedaant"));

        Predicate<String>isWordEndingWithT =x->x.toLowerCase().endsWith("t");
        System.out.println(isWordEndingWithT.test("Vedaant"));

        // Coupled both the above conditions
        Predicate<String>an=isWordStartingWithV.and(isWordEndingWithT);
        System.out.println(an.test("Vipul"));

        // Function --> work for you
        Function<Integer, Integer>doubleIt=x->2*x;
        System.out.println(doubleIt.apply(36));

        Function<Integer, Integer>tripleIt=x->3*x;
        System.out.println(tripleIt.apply(72));

        // Couples both the above conditions
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(40)); // same
        //compose method
        System.out.println(doubleIt.compose(tripleIt).apply(40)); // same

        // it is a static method - returns a function that always returns its input argument
        Function<Integer,Integer>identify=Function.identity();
        Integer app=identify.apply(5);
        System.out.println(app);

        // Consumer - Doesn't return anything because it is void (it only consumes)
        // has accept() method
        Consumer<Integer>consume=x-> System.out.println(x);
        consume.accept(58);

        List<Integer> list=Arrays.asList(1,2,3,4);
        Consumer<List<Integer>>printList=x-> {
            for(int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier - Doesn't take anything , only give
        // one method get()
        Supplier<String>giveHelloWorld=()->"Hello World";
        System.out.println(giveHelloWorld.get());

        // Combined example
        Predicate<Integer>predicato=x->x%2==0;
        Function<Integer,Integer>func=x->x*x;
        Consumer<Integer>cons=x-> System.out.println(x);
        Supplier<Integer>supp=()->100;

        if(predicato.test(supp.get())){
            cons.accept(func.apply(supp.get()));
        }

            // BiPredicate, BiConsumer, BiFunction
            BiPredicate<Integer,Integer>isSum=(x,y)->(x+y)%2==0;
            System.out.println(isSum.test(5,5));

            BiConsumer<Integer,String>biconsume=(x,y)->{
                System.out.println(x);
                System.out.println(y);
            };
            biconsume.accept(5,"Hello");

            BiFunction<String,String,Integer>biFunction=(x,y)->(x+y).length();
            System.out.println(biFunction.apply("a","bc"));

            // Unary Operator ---> It extends Function and provide us a concise way to use Function
            UnaryOperator<Integer> a=x->2*x;
            System.out.println(a.apply(9));

            // Binary Operator ---> It extends BiFunction and provide us a concise way to write and use BiFunction Interface
            BinaryOperator<Integer>b=(x,y)->(x+y)*2;
            System.out.println(b.apply(4,8));

            // Method Reference ---> use method without invoking & in place of lambda expression
            List <String> students=Arrays.asList("Vedaant","Rajat","Siddharth","Madhav");
            students.forEach(x-> System.out.println(x)); // --> instead of this we can use Method reference
            System.out.println();
            students.forEach(System.out::println);  // In this we are giving method as a parameter

            // Constructor Reference
            List<String>names=Arrays.asList("A","B","C","D");


        }
        class MobilePhone{
        String name;

            public MobilePhone(String name) {
                this.name = name;
            }
        }


    }
    interface MathOperation{
        int operate(int a, int b);
    }

