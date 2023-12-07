package drugmacy.Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connector {
    private String DB_URL = "jdbc:mysql://localhost:3306/db_drugmacy";
    private String DB_USER = "root";
    private String DB_PASSWORD = "";

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public Connector() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, " JOptionPane.showMessageDialog(null, \"JDBC Driver not found: \" + e.getMessage()," + e.getMessage(),
                    "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }

        try {
            // Establish the database connection
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(),
                    "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error executing query: " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error executing query: " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Close resources (Connection, Statement, ResultSet)
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(),
                    "Resource Closing Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
