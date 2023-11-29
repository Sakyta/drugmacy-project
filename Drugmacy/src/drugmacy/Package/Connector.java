/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugmacy.Package;
import java.sql.*;

/**
 *
 * @author nurka
 */
public class Connector {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String db = "jdbc:mysql://localhost:3306/db_drugmacy";
    private String user = "root";
    private String password = "";
    private Connection conn = null;
    private Statement state = null;
    private ResultSet rs = null;
    
    public void Connector()
    {
        try
        {
            Class.forName(driver);
        }
        catch (Exception e)
        {
            System.out.println("Driver Error");
        }                
        
        try 
        {
            conn = (Connection) DriverManager.getConnection(db, user, password);
            state = (Statement) conn.createStatement();
        } 
        catch (Exception e) 
        {
            System.out.println("Connection Error");
        }
    }
    
    public void insert()
    {
        // TODO
    }
    
    public void update()
    {
        // TODO
    }
    
    public void delete()
    {
        // TODO
    }
    
    public void getData()
    {        
        // TODO                
    }
}
