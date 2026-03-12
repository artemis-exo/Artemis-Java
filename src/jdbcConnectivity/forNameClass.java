package jdbcConnectivity;


public class forNameClass {
    public static void main(String[] args) throws Exception {
        Class.forName("jdbcConnectivity.Pqr").newInstance();
        // for driver
      //  Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
class Pqr{
    static {
        System.out.println("In static");
    }

    // Instance block
    {
        System.out.println("In Instance");
    }
}
