package collections;


	interface WordCount {
	    int count(String str);
	}

	public class Question19 {
	    public static void main(String[] args) {
	        WordCount wc = (str) -> str.trim().split("\\s+").length;
	        System.out.println(wc.count("This is a sample sentence with seven words"));
	    }
	}


