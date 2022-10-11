import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Username: ");
        userName = inp.nextLine();

        System.out.print("Password: ");
        password = inp.nextLine();

        //username:patika, password:java123

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login.");
        } else {

            System.out.println("Wrong password. Reset password.");

        }

        // reset password

        String newPassword;
        System.out.print("New Password: ");
        newPassword = inp.nextLine();

        if (newPassword.equals("java123")){
            System.out.println("The new password cannot be the same as the old password.");

        } else {
            System.out.print("Password updated.");
        }

    }
}