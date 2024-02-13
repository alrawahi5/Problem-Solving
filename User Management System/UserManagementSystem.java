import java.lang.*;
import java.util.Scanner;
class UserManagementSystem {
    public static void main(String[] args) {

        // scan a user name
        System.out.println("Please Enter Your Name: ");
        Scanner name = new Scanner(System.in);
        String typedName = name.nextLine();

        // scan a user UserName
        System.out.println("Please Enter Your Chosen UserName: ");
        Scanner userName = new Scanner(System.in);
        String typedUserName = userName.nextLine();

        // scan a user UserPassword
        System.out.println("Please Enter Your Chosen User Password: ");
        Scanner userPasswordd = new Scanner(System.in);
        String typePassword = userPasswordd.nextLine();

        // scan a user UserRole
        System.out.println("Please Enter Your Chosen User Role: ");
        Scanner userRole = new Scanner(System.in);
        String typeRole = userRole.nextLine();

        // The output
        System.out.println("your name is: " + typedName);
        System.out.println("your UserName is: " + typedUserName);
        System.out.println("your chosen passowrd is: " + typePassword);
        System.out.println("your chosen Role is: " + typeRole);

        
    }
}