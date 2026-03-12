package jdbcConnectivity;
import Access_modifier.school.Student;

import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) {
     StudentDao dao=new StudentDao();
     // This is for fetching
     //Stud s1=dao.getStudentById(6);
       // System.out.println(s1.name);
       // This is for adding the entry in DB
        Stud s2=new Stud();
        s2.id=10;
        s2.name="Mayank";
        s2.age=22;
        dao.connect();
        dao.addStudent(s2);
        //dao.deleteStudent(8);

    }
}
class StudentDao{
    Connection con=null;
    public  void connect(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "v@1992214118B");
       } catch(Exception e){
           System.out.println(e);
       }
    }

    public Stud getStudentById(int id) {
        try{
            String  query="select name from student where id="+id;
            Stud s = new Stud();
            s.id = id;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name=rs.getString(1);
            s.name=name;
            return s;
        } catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    public void addStudent(Stud s){
        String query="insert into student values(?,?,?)";
        PreparedStatement pstmt;
        try{
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,s.id);
            pstmt.setString(2,s.name);
            pstmt.setInt(3,s.age);
            pstmt.executeUpdate();
            System.out.println("Records inserted");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void deleteStudent(int id){
        String query="delete from student where id= ?";
        PreparedStatement pstmt;
        try{
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,id);

            int count=pstmt.executeUpdate();
            System.out.println(count+" records deleted");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
class Stud{
    int id;
    String name;
    int age;
}