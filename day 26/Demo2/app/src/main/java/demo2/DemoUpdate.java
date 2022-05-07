package demo2;
import java.sql.*;
public class DemoUpdate {

    public static void main(String[] args) throws Exception{
        
    
    Class.forName("org.postgresql.Driver");
    System.out.println("Driver loaded");
    Connection conn;
    conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1","postgres","root");

    System.out.println("connection done");

    Statement stmt;
    stmt = conn.createStatement();
    String sql;
    sql = "insert into student values(700,'pg')";

    stmt.executeUpdate(sql);
    System.out.println("record inserted");

    conn.close();
    }
}
