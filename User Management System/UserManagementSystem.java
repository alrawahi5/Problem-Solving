import java.lang.*;
import java.util.Scanner;
class UserManagementSystem {
    public static void main(String[] args) {

        // scan a user name
        System.out.println("Please Enter You Name: ");
        Scanner name = new Scanner(System.in);
        String typedName = name.nextLine();


        System.out.println("Please Enter Your Chosen UserName: ");
        Scanner userName = new Scanner(System.in);
        String typedUserName = userName.nextLine();

        System.out.println("your name is: " + typedName);
        System.out.println("your UserName is: " + typedUserName);

    }
}