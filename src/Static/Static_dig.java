package Static;

public class Static_dig {
    // For Students
    public static int count=0;

    static{                     // STATIC BLOCK - Used for performing static initialisation, for setting up one time task
        System.out.println("HELLO");
    }

    public Static_dig(){
        count++;
    }

    private int age;
    private String name;
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getCount(){
        System.out.println("TOTAL STUDENTS ARE :"+count);
    }
}
