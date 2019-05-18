/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta negi
 */
import java.sql.*;

public class Myclass {
    public  static void main(String args[])
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
        Statement sm=con.createStatement();
        sm.executeUpdate("select *from Mydb");
        }catch(Exception e){}
    }
    
}
