package model;
import dao.loginDAO;
import java.util.Scanner;
public class login {
    Scanner scanner = new Scanner(System.in);
    private String usernames;
    private String passwords;

    public void choice(){
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Thoát");
        System.out.print("Nhập lựa chọn của bạn:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                signIn();
                break;
            case 2:
                signUp();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.print("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                choice();
        }
    }

    private void signIn(){
        System.out.print("Nhập username:");
        usernames = scanner.nextLine();
        System.out.print("Nhập password:");
        passwords = scanner.nextLine();
        loginDAO loginDAO = new loginDAO();

        if(loginDAO.checkUsername(usernames)){
            if(loginDAO.checkPassword(passwords)){
                System.out.println("dang nhap thanh cong");
                    if(loginDAO.checkRole(usernames).equals("admin")){
                        // di vao gd admin
                    }
                    else if(loginDAO.checkRole(usernames).equals("manager")){
                        // di vao manager
                    }
                    else if(loginDAO.checkRole(usernames).equals("passenger")){
                        // di vao passenger
                    }
            } else {
                System.out.println("kiem tra lai password");
            }
        } else {
            System.out.println("kiem tra username va password");
        }
    }

    //chua co loc khoang trong
    private void signUp() {
        System.out.println("nhap username:");
        usernames = scanner.nextLine();
        System.out.println("nhap password:");
        passwords = scanner.nextLine();
        loginDAO loginDAO = new loginDAO();

        if (loginDAO.checkUsername(usernames)) {
            System.out.println("username da ton tai, vui long chon username khac");
        } else {
            loginDAO.importAccount(usernames, passwords);
            System.out.println("Dang ki thanh cong");
        }
    }
}
