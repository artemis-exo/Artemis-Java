package MultiThreading;
// If we use void as return we can make the code more short we can also remove the return and can print directly

public class Test2 {
    public static void main(String[] args) {
        Student_lamb eng = new Student_lamb() {
            @Override
            public String getBio(String name) {
                return name +" is Engineering Student";
            }
        };
        String bio=eng.getBio("Vedaant");
        System.out.println(bio);

        Student_lamb law=name->{return name+" is law student";};
        String hy=law.getBio("Artemis");
        System.out.println(hy);


    }
}
