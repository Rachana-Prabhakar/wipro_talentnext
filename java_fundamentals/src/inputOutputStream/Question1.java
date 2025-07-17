package inputOutputStream;
import java.io.*;
import java.util.Scanner;
public class Question1 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Task 1: Character count
	        System.out.println("Enter the file name");
	        String fileName = scanner.nextLine();

	        System.out.println("Enter the character to be counted");
	        char targetChar = scanner.nextLine().toLowerCase().charAt(0);

	        int count = 0;
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            int c;
	            while ((c = reader.read()) != -1) {
	                if (Character.toLowerCase((char)c) == targetChar) {
	                    count++;
	                }
	            }
	            System.out.println("File " + fileName + " has " + count + " instances of letter");
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }

	        // Task 2: Copy file content
	        System.out.println("\nEnter the input file name");
	        String inputFile = scanner.nextLine();

	        System.out.println("Enter the output file name");
	        String outputFile = scanner.nextLine();

	        try (
	            FileReader fr = new FileReader(inputFile);
	            FileWriter fw = new FileWriter(outputFile)
	        ) {
	            int c;
	            while ((c = fr.read()) != -1) {
	                fw.write(c);
	            }
	            System.out.println("File is copied");
	        } catch (IOException e) {
	            System.out.println("Error copying file: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}



