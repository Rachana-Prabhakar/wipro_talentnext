package oopsAndInheritance;

public class Sample8 {
	    public static String mergeAlternate(String a, String b) {
	        StringBuilder result = new StringBuilder();
	        int len = Math.max(a.length(), b.length());

	        for (int i = 0; i < len; i++) {
	            if (i < a.length()) {
	                result.append(a.charAt(i));
	            }
	            if (i < b.length()) {
	                result.append(b.charAt(i));
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(mergeAlternate("Hello", "World")); 
	    }
	}


