package oopsAndInheritance;

public class Sample6 {

	    public static void main(String[] args) {
	        String input = "WiPro";
	        int len = input.length();
	        
	        if (len < 2) {
	            System.out.println("String too short");
	            return;
	        }
	        
	        String first2 = input.substring(0, 2);
	        StringBuffer sb = new StringBuffer();
	        
	        for (int i = 0; i < len; i++) {
	            sb.append(first2);
	        }
	        
	        System.out.println(sb.toString());
	    }
	}


