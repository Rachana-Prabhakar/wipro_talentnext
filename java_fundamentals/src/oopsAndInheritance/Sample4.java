package oopsAndInheritance;

public class Sample4 {
	
	    public static void main(String[] args) {
	        String input = "Level";
	        String lower = input.toLowerCase();
	        StringBuffer sb = new StringBuffer(lower);
	        String reversed = sb.reverse().toString();
	        
	        if (lower.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
	}


