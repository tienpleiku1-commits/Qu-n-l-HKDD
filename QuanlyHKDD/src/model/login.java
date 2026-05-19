package model;
import dao.loginDAO;
import java.util.Scanner;
public class login {
    Scanner scanner = new Scanner(System.in);
    public static String usernames;
    public static String passwords;

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
                System.out.printf("Lựa chọn không hợp lệ! Vui lòng nhập lại.\r\r\r\r");
                choice();
        }
    }

    private void signIn(){
        System.out.print("Nhập username:");
        usernames = scanner.nextLine();
        System.out.print("Nhập password:");
        passwords = scanner.nextLine();
        loginDAO loginDAO = new loginDAO();
        String resultUsername = loginDAO.exportUsername();
        String resultPassword = loginDAO.exportPassword();
        if(resultUsername != null && resultUsername.equals(usernames)){
            if(resultPassword != null && resultPassword.equals(passwords)){
                System.out.println("dang nhap thanh cong");
            } else {
                System.out.println("kiem tra lai password");
            }
        } else {
            System.out.println("kiem tra username va password");
        }
    }
    private void signUp(){
        System.out.println("nhap username:");
        usernames = scanner.nextLine();
        System.out.println("nhap password:");
        passwords = scanner.nextLine();
        loginDAO loginDAO = new loginDAO();
        String resultUsername = loginDAO.exportUsername();
        if(resultUsername.equals(usernames)){
            System.out.println("username da ton tai, vui long chon username khac");
        } else {
        //    loginDAO.importAccount();
        }

    }
}
