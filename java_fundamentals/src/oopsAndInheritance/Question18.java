package oopsAndInheritance;

//User defined exception for invalid age
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Question18 {
 public static void main(String[] args) {
     try {
       
         if (args.length != 2) {
             System.out.println("Error: Please enter exactly 2 arguments - <Name> <Age>");
             return;
         }

         String name = args[0];
         String ageInput = args[1];
         int age;

         try {
             age = Integer.parseInt(ageInput);
         } catch (NumberFormatException e) {
             System.out.println("Error: Age must be a valid integer.");
             return;
         }

         if (age <= 0) {
             throw new InvalidAgeException("Error: Age must be greater than 0.");
         }

         System.out.println("Name: " + name);
         System.out.println("Age: " + age);

     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
 }
}

