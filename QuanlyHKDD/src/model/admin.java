package model;

public class admin {
    private int adminID;
    private int loginID;
    private String name;
    private String email;
    private String phone;
}

public admin() {}

public admin (int admin, int loginID, String name, String email, String phone) {
    this.adminID = adminID;
    this.loginID = loginID;
    this.name = name;
    this.email = email;
    this.phone = phone;
}

public int getAdminID() { return adminID;}
public void setAdminID(int adminID) { this.adminID = adminID;}

public int getLoginID() { return loginID;}
public void setLoginID(int loginID) { this.loginID = loginID;}  

public String getName() { return name;}
public void setName(String name) { this.name = name;}

public String getEmail() { return email;}
public void setEmail(String email) { this.email = email;}

public String getPhone() { return phone;}
public void setPhone(String phone) { this.phone = phone;}
