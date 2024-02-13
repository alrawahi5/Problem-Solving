package UserManagementSystem;

import java.lang.*;
import java.util.Scanner;
class UserManagementSystem {

    private static Scanner name;
    private static  String typedName;
    private static Scanner userName;
    private static String typedUserName;
    private static Scanner userPasswordd;
    private static String typePassword;
    private static Scanner userRole;
    private static String typeRole;
        static void addUser(Scanner ann) {
            // scan a user name
            System.out.println("Please Enter Your Name: ");
            name = new Scanner(System.in);
            typedName = name.nextLine();

            // scan a user UserName
            System.out.println("Please Enter Your Chosen UserName: ");
            userName = new Scanner(System.in);
            typedUserName = userName.nextLine();

            // scan a user UserPassword
            System.out.println("Please Enter Your Chosen User Password: ");
            userPasswordd = new Scanner(System.in);
            typePassword = userPasswordd.nextLine();

            // scan a user UserRole
            System.out.println("Please Enter Your Chosen User Role: ");
            userRole = new Scanner(System.in);
            typeRole = userRole.nextLine();
            // The output
//            System.out.println("your name is: " + typedName);
//            System.out.println("your UserName is: " + typedUserName);
//            System.out.println("your chosen passowrd is: " + typePassword);
//            System.out.println("your chosen Role is: " + typeRole);
        }
    //this method shows the entred info
        public static void viewUser( ){
            System.out.println("your name is: " + typedName );
            System.out.println("your UserName is: " + typedUserName);
            System.out.println("your chosen passowrd is: " + typePassword);
            System.out.println("your chosen Role is: " + typeRole);
    }
    public static void saveUser(){

    }
    public static void main(String[] args) {
            Scanner ann = new Scanner(System.in);
        addUser(ann);
        viewUser();
    }
}