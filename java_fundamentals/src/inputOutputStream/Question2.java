package inputOutputStream;
import java.io.*;
import java.util.*;
public class Question2 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get file names from user
	        System.out.println("Enter the input file name:");
	        String inputFile = scanner.nextLine();

	        System.out.println("Enter the output file name:");
	        String outputFile = scanner.nextLine();

	        // Map to store word counts
	        Map<String, Integer> wordCountMap = new TreeMap<>(); // TreeMap sorts keys alphabetically

	        // Read from input file and count words
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Split words, convert to lowercase, and clean punctuation if needed
	                String[] words = line.split("\\s+");
	                for (String word : words) {
	                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); // clean and normalize
	                    if (!word.isEmpty()) {
	                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading input file: " + e.getMessage());
	            return;
	        }

	        // Write word counts to output file
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
	            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	                writer.write(entry.getKey() + " " + entry.getValue());
	                writer.newLine();
	            }
	            System.out.println("Word counts written to " + outputFile);
	        } catch (IOException e) {
	            System.out.println("Error writing to output file: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}

