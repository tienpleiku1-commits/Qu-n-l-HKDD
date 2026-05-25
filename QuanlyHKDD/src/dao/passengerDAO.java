package dao;

import model.passenger;
import util.DBConnection;

import java.sql.*;

public class passengerDAO extends roleDAO {

    private final Connection connection;// Biến kết nối cơ sở dữ liệu
    public Statement stmt;// Biến để chạy câu lệnh SQL
    public passengerDAO() {
        try {
            connection = DBConnection.getConnection();
            stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public passenger getByID (int loginID){// return ra kieu du lieu la 1 object
        passenger p = null;
        String query = "SELECT ID, name, date_of_birth, passport, email FROM passenger " + ";" ;
        try {
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                p = new passenger(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDate("date_of_birth"),
                        rs.getString("passport"),
                        rs.getString("email")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
//cap nhat, xoa, xem chuyen bay, dat ve chi cua khach
    @Override
    void update(int ID, String name, Date dateOfBirth, String passport, String email) {
        super.update(ID, name, dateOfBirth, passport, email);

        String query = "UPDATE login" +
                " SET name ='" + name + "'," +
                "date_of_date =" + dateOfBirth + "," +
                "passport ='" + passport + "'," +
                "email'" + email + "',"+
                "WHERE loginID = " + ID +";";
        try {
            int rows = stmt.executeUpdate(query);// kiem tra xem co dong nao bi thay doi hay khong, neu > 0 thi dang ky thanh cong
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void delete(int ID, String name, Date dateOfBirth, String passport, String email) {
        super.delete(ID, name, dateOfBirth, passport, email);
    }

    @Override
    void viewFlight(int ID) {
        super.viewFlight(ID);
    }

    @Override
    void bookingFlight(int ID) {
        super.bookingFlight(ID);
    }
}
