package inputOutputStream;
import java.io.*;
public class Sample1 {
	
	    public static void main(String[] args) {
	        String inputFile = "Input.txt";
	        String outputFile = "Output.txt";

	        try (FileWriter fw = new FileWriter(inputFile)) {
	            fw.write("This is a sample input file.\n");
	            fw.write("It contains multiple lines of text.\n");
	            fw.write("This will be copied to the output file.");
	            System.out.println("Sample file '" + inputFile + "' created with content.");
	        } catch (IOException e) {
	            System.out.println("Error creating input file: " + e.getMessage());
	            return;
	        }

	        try (
	            FileReader fr = new FileReader(inputFile);
	            FileWriter fw = new FileWriter(outputFile)
	        ) {
	            int c;
	            while ((c = fr.read()) != -1) {
	                fw.write(c);
	            }
	            System.out.println("Content successfully copied to '" + outputFile + "'");
	        } catch (IOException e) {
	            System.out.println("Error copying file: " + e.getMessage());
	        }
	    }
	}



