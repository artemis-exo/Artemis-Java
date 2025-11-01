class Employee {
    int id;
    String salary;
    String name;
    public void printDetails(){
        System.out.println("My ID is "+ id);
        System.out.println("And My Name is "+ name);
    }
    public String getSalary(){
        return salary;
    }
}


public class oops {
    public static void main(String[] args) {
        System.out.println(" This is our Custom Class");
        Employee vedaant = new Employee();  //Instantiating a new Employee Object
        Employee siddhant= new Employee();  //Instantiating a new Employee Object

        //Setting Attributes
        vedaant.id =24;
        vedaant.name ="Artemis Eloquet";
        vedaant.salary ="66 LPA";
        siddhant.id =36;
        siddhant.name ="Blade Flawx";
        siddhant.salary ="64 LPA";

        //Printing Attributes
        vedaant.printDetails();
        String salary = vedaant.getSalary();
        System.out.println("My Salary is"+salary);
        siddhant.printDetails();
        String salari = siddhant.getSalary();
        System.out.println("My Salary is"+salari);



    }
}
