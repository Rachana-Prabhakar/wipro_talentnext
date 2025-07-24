package collections;
import java.util.*;
public class Question15 {


	    public static void main(String[] args) {
	        HashMap<String, Integer> contactList = new HashMap<>();
	        contactList.put("Ravi", 987654321);
	        contactList.put("Meena", 876543210);
	        contactList.put("Asha", 765432109);

	        System.out.println(contactList.containsKey("Ravi"));
	        System.out.println(contactList.containsValue(765432109));

	        Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<String, Integer> entry = itr.next();
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}


