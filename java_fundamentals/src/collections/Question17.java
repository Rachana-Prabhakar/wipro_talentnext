package collections;
import java.util.*;
public class Question17 {
	

	    public static void main(String[] args) {
	        Hashtable<String, Integer> contactList = new Hashtable<>();
	        contactList.put("Ravi", 987654321);
	        contactList.put("Meena", 876543210);
	        contactList.put("Asha", 765432109);

	        System.out.println(contactList.containsKey("Asha"));
	        System.out.println(contactList.containsValue(999999999));

	        Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<String, Integer> entry = itr.next();
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}


