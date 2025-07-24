package collections;
import java.util.*;
public class Question14 {
	

	    public static void main(String[] args) {
	        Properties states = new Properties();
	        states.put("Telangana", "Hyderabad");
	        states.put("Maharashtra", "Mumbai");
	        states.put("Tamil Nadu", "Chennai");
	        states.put("Karnataka", "Bengaluru");

	        Set<Object> keys = states.keySet();
	        Iterator<Object> itr = keys.iterator();
	        while (itr.hasNext()) {
	            Object key = itr.next();
	            System.out.println(key + " -> " + states.get(key));
	        }
	    }
	}


