package InheritenceCA;

public class Test {
    public static void main(String[] args) {
        System.out.println("Single Level Inheritance Example");
        EngineeringStudent e=new EngineeringStudent();
        e.markAttendance();
        e.attendLab();
        System.out.println("MultiLevel Inheritance Example");
        MCA_Student m=new MCA_Student();
        m.markAttendance();
        m.attendMLLab();
        m.attendMLLab();

        System.out.println("Hierarchical Inheritance Example");
        MedicalStudent md=new MedicalStudent();
        md.markAttendance();
        md.attendPhysioLab();

        System.out.println("Super Keyword Method");
        Stud sp=new Stud();
        sp.name="Shashank";
        sp.age=28;
        sp.height=182;
        sp.college="USCS";
        sp.print();

    }
}
