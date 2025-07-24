package collections;


	import java.util.HashSet;

	public class Question8 {
	    HashSet<String> H1 = new HashSet<>();

	    public HashSet<String> saveCountryNames(String countryName) {
	        H1.add(countryName);
	        return H1;
	    }

	    public String getCountry(String countryName) {
	        for (String country : H1) {
	            if (country.equals(countryName)) {
	                return country;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Question8 obj = new Question8();
	        obj.saveCountryNames("India");
	        obj.saveCountryNames("Japan");
	        obj.saveCountryNames("Germany");
	        System.out.println(obj.getCountry("Japan"));
	        System.out.println(obj.getCountry("France"));
	    }
	}


