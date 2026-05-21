package dao;
import util.DBConnection;

import java.util.*;
import java.sql.*;

public class loginDAO {
    private final Connection connection;// Biến kết nối cơ sở dữ liệu
    public Statement stmt;// Biến để chạy câu lệnh SQL
    public loginDAO() {
        try {
            connection = DBConnection.getConnection();
            stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkUsername(String USERNAME) {// Method để xuất dữ liệu từ bảng login
        String query = "SELECT username FROM login WHERE username = '" + USERNAME + "';" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if(rs.getString("username").equals(USERNAME))return true ;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean checkPassword(String PASSWORD) {// Method để xuất password từ bảng login
        String query = "SELECT password FROM login WHERE password = '" + PASSWORD + "';" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if(rs.getString("password").equals(PASSWORD)) return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public String checkRole(String USERNAME){
        String query = "SELECT role FROM login WHERE username = '" + USERNAME + "';" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getString("role");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "passenger";
    }




    // chua loc khoang trong
    public void importAccount(String USERNAME, String PASSWORD) {
        String query = "INSERT INTO login (username, password, role) VALUES ('" + USERNAME + "', '" + PASSWORD + "', 3)";
        try {
            int rows = stmt.executeUpdate(query);// kiem tra xem co dong nao bi thay doi hay khong, neu > 0 thi dang ky thanh cong
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}