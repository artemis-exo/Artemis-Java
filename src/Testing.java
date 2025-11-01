public class Testing {
    public static void main(String[] args) {
        Student student =new Student();  // OBJECT CREATION  , DEFAULT CONSTRUCTOR
       // Student student1 =new Student("RAM",21,16);  // PARAMETERIZED CONSTRUCTOR
       // Student student2=new Student("CARLOS ALCARAZ"); // FOR SINGLE PARAMETER
      //  Student student3=new Student(); //FOR SINGLE PARAMETER
        System.out.println(student.getAge()); // OVERLOADED DEFAULT CONSTRUCTOR VALUE
        student.setName("yiker");
        student.setAge(16);
        student.setRoll_no(67);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRoll_no());

//        System.out.println(student1.getAge()); // ALL
//       System.out.println(student1.getName()); // THREE FOR
//        System.out.println(student1.getRoll_no()); // PARAMETERIZED CONSTRUCTOR (Student 1)
//
        Bank_Account acc= new Bank_Account();
        Bank_Account acc1= new Bank_Account();
        acc.setAccountmumber(636787);
        acc.deposit(-14);
        acc.withdraw(7);
        acc.deposit(116);
        acc.withdraw(99);
        System.out.println(acc.getBalance());

        acc1.setAccountmumber(767236);
        acc1.deposit(78);
        acc1.withdraw(7);
        acc1.deposit(-116);
        acc1.withdraw(-99);
        System.out.println(acc1.getBalance());

    }
}
