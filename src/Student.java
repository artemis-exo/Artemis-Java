public class Student {
    private String name;   // INSTANCE VARIABLE
    private int roll_no;
    private int age;

    public Student(){
        this.age=14;  //OVERLOADED CONSTRUCTOR
    }
//    public Student(String name , int roll_no, int age){  // PARAMETERIZED CONSTRUCTOR
//        this.age=age;
//        this.roll_no=roll_no;
//        this.name=name;
//    }
    public Student(String name){
        this.name=name;
    }
    public Student(int roll_no){
        this.roll_no=roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public int getRoll_no() {
        return roll_no;
    }

    public void setAge(int age){
        if(age<0){
            System.out.println("INVALID AGE ");
        }
        else{
            this.age=age;
        }
    }
    public int getAge(){
        return  this.age;
    }


}