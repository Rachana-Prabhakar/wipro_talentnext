package collections;
import java.util.*;
public class Question16 {
	

	    public static void main(String[] args) {
	        TreeMap<String, Integer> contactList = new TreeMap<>();
	        contactList.put("Ravi", 987654321);
	        contactList.put("Meena", 876543210);
	        contactList.put("Asha", 765432109);

	        System.out.println(contactList.containsKey("Meena"));
	        System.out.println(contactList.containsValue(123456789));

	        Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<String, Integer> entry = itr.next();
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}


