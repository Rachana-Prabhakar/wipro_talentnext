package oopsAndInheritance;

import java.util.Scanner;

//Custom Exception
class InvalidCountryException extends Exception {
 public InvalidCountryException(String message) {
     super(message);
 }
}

public class Question17 {

 void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException("User Outside India cannot be registered");
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Question17 reg = new Question17();

     System.out.println("Enter username:");
     String username = sc.nextLine();

     System.out.println("Enter user country:");
     String country = sc.nextLine();

     try {
         reg.registerUser(username, country);
     } catch (InvalidCountryException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}

