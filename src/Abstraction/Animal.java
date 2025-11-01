package Abstraction;

public abstract class  Animal {
    private String name;
    private int age;

    private boolean hasSuperPower;

    protected Animal(){
        this.hasSuperPower=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void sayHello(); // ABSTARCT METHOD HAVING NO DEFINITION

    public void sleep(){    // CONCREATE CLASS HAVING METHOD DEFINITION
        System.out.println("Zzzz...");
    }
}
