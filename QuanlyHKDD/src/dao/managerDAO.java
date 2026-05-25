package dao;

import util.DBConnection;

import java.sql.*;

public class managerDAO extends roleDAO{

    private final Connection connection;// Biến kết nối cơ sở dữ liệu
    public Statement stmt;// Biến để chạy câu lệnh SQL
    public managerDAO() {
        try {
            connection = DBConnection.getConnection();
            stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //cap nhat, xoa, xem chuyen bay, dat ve cua bat ki ai nhung khong xoa duoc chuyen bay va ve
    @Override
    void update(int ID, String name, Date dateOfBirth, String passport, String email) {
        super.update(ID, name, dateOfBirth, passport, email);
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
