package Encapsulation;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String college;

    Student(String name , int rollNo, int age, String college){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.college=college;
    }
    // Getters ans Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        // Validation --> college should be real
        this.college=college;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }


}
