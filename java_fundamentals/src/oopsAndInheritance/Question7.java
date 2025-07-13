package oopsAndInheritance;

public class Question7 {

	    public static String removeX(String str) {
	        int len = str.length();
	        if (len == 0) return str;

	        if (str.charAt(0) == 'x') {
	            str = str.substring(1);
	            len--;
	        }
	        if (len > 0 && str.charAt(str.length() - 1) == 'x') {
	            str = str.substring(0, str.length() - 1);
	        }

	        return str;
	    }

	    public static void main(String[] args) {
	        System.out.println(removeX("xHix"));      // Output: Hi
	        System.out.println(removeX("America"));   // Output: America
	    }
	}


