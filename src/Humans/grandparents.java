package Humans;

public class grandparents {
    private  String name;
    private int age;
    private boolean hasSuperPowers;

    public boolean HasSuperPowers() {
        return hasSuperPowers;
    }

    public grandparents(int age , String name){
       this.age=age;   // used for creating current object  // child inherit age and name
       this.name= name;
        hasSuperPowers=false;
        System.out.println("GRANDPARENTS CONSTRUCTOR CALLED ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  // THIS MEANS CURRENT INSTANCE

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
