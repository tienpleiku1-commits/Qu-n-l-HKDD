package model;

import java.sql.Date;

public class passenger {
    public int ID;
    public String name;
    public Date dateOfBirth;
    public String passport;
    public String email;

    public passenger(){};

    public passenger (int ID, String name, Date dateOfBirth, String passport, String email){
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.email = email;
    };


}
