package dao;
import model.login;
import util.DBConnection;

import java.util.*;
import java.sql.*;

public class loginDAO {
    private Connection connection;// Biến kết nối cơ sở dữ liệu
    private Statement stmt;// Biến để chạy câu lệnh SQL
    public loginDAO() {
        try {
            connection = DBConnection.getConnection();
            stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String exportUsername() {// Method để xuất dữ liệu từ bảng login
        String query = "SELECT username FROM login WHERE username = '" + login.usernames + "';" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getString("username");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String exportPassword() {// Method để xuất password từ bảng login
        String query = "SELECT password FROM login WHERE password = '" + login.passwords + "';" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

//    public String importAccount() {// Method để nhapaj dữ liệu từ bảng login
//        String query = "INSERT INTO login (username, password) VALUES ('" + login.usernames + "', '" + login.passwords + "');";
//
//        try{
//            stmt.executeUpdate(query);
//            return "Đăng ký thành công!";
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    //can ai do fix

}