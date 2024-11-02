package Project;
import java.sql.*;

public class ConnectionProvider {
    private static final String URL = "jdbc:oracle:thin:@localhost:1523:orclsql"; 
    private static final String USER = "HR"; 
    private static final String PASSWORD = "HR"; 

    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
        return con; 
    }
}
