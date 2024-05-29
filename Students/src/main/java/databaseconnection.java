
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khushi Choudhary
 */
public class databaseconnection {
    //C:\Users\Khushi Choudhary\OneDrive\Desktop\mysql-connector-j-8.2.0;
    final static String JDBC_Driver ="com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/project";
    final static String USER = "root";
    final static String PASS ="";
    
    public static Connection connection(){
        
        try{
            Class.forName("JDBC_DRIVER");
            Connection conn = DriverManager.getConnection("DB_URL","User","Pass");
            return conn;
            
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
       
    }
    
    
}
