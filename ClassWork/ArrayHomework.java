package uk.ac.uos.i2p.s223358;

import java.util.Scanner; // program uses class Scanner
public class ArrayHomework { 
  public static void main(String[] args) { 

    //defining username array 
    String[] usernames = {
      "David",
      "Jim",
      "JJ"
    };

    //defining password array 
    String[] passwords = {
      "Password1",
      "Hello",
      "AnotherPassword"
    };

    //collecting username, storing as variable
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Username: ");
    String username = input.next();

    //collecting password, storing as variable 
    Scanner input2 = new Scanner(System.in);
    System.out.print("Enter Password: ");
    String password = input2.next();

    //checking if variable username matches index 0 in the username array, same for password
    if (username.equals(usernames[0]) && password.equals(passwords[0])) {
      //if true, must be user1, shows welcome message to David
      System.out.println("Welcome David");
    }
    //otherwise, repeat for Jim
    else if (username.equals(usernames[1]) && password.equals(passwords[1])) {
      System.out.println("Welcome Jim");
    }
    //repeat for JJ
    else if (username.equals(usernames[2]) && password.equals(passwords[2])) {
      System.out.println("Welcome JJ");
    }
    //If no match, login failed 
    else
      System.out.println("Login Failed");

  }
}