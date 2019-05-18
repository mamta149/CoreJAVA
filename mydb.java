 import java.sql.*;
public class mydb {
    Connection con;
    public Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement sm=con.createStatement();
            
        }catch(Exception e){System.out.println(e);}
        return con;
    }
}
        
    

    

