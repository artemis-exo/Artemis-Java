package jdbcConnectivity;
import java.sql.*;
import java.sql.Connection;
public class Koem {
    /*
    import ---> java.sql
    load and register the driver -->com.mysql.jdbc.Driver
    Create connection
    Create a statement
    Execute the Query
    process the results
    close


     */
    public static void main(String[] args) {
        try{
            String query="insert into student values (7,'Amrita',22)";
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","v@1992214118B");
            Statement st=con.createStatement();
            int count=st.executeUpdate(query);
            ResultSet rs=st.executeQuery("select * from student");
            System.out.println(count + "row/s affected");

            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }


