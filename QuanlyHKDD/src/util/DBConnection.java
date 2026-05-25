package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//datatype SQL Date: YYYY-MM-DD
public class DBConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1/flight_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Hklt20112007@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}