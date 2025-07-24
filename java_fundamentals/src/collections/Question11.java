package collections;

	import java.util.TreeSet;

	public class Question11 {
	    TreeSet<String> H1 = new TreeSet<>();

	    public TreeSet<String> saveCountryNames(String countryName) {
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
	        Question11 obj = new Question11();
	        obj.saveCountryNames("India");
	        obj.saveCountryNames("Japan");
	        obj.saveCountryNames("Canada");
	        System.out.println(obj.getCountry("Canada"));
	        System.out.println(obj.getCountry("Brazil"));
	    }
	}


