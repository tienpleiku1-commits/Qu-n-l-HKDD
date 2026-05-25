package dao;

import java.sql.Date;

public abstract class roleDAO {

    void update(int ID, String name, Date dateOfBirth, String passport, String email) {
        // cap nhat thong tin
    }

    void delete(int ID, String name, Date dateOfBirth, String passport, String email) {
        // xoa thong tin
    }

    void viewFlight(int ID) {
        // xem thong tin chuyen bay
    }

    void bookingFlight(int ID) {
        // dat ve
    }






}
