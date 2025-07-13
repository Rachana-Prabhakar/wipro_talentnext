package oopsAndInheritance;

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name of student " + i + ": ");
                String name = sc.nextLine();

                int total = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Enter mark " + j + " for " + name + ": ");
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks not allowed.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Mark out of range (0-100).");
                    }

                    total += mark;
                }

                double average = total / 3.0;
                System.out.println("Average marks of " + name + ": " + average);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integers for marks.");
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}

