package collections;
import java.util.*;

public class Question13 {
	
	    public static void main(String[] args) {
	        HashMap<String, String> map = new HashMap<>();
	        map.put("India", "Delhi");
	        map.put("Japan", "Tokyo");
	        map.put("France", "Paris");

	        System.out.println(map.containsKey("India"));
	        System.out.println(map.containsValue("Paris"));

	        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<String, String> entry = itr.next();
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}


