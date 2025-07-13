package oopsAndInheritance;
import java.util.Optional;
public class Sample11 {


	    public static void main(String[] args) {
	        String address = null;
	        Optional<String> optionalAddress = Optional.ofNullable(address);
	        System.out.println(optionalAddress.orElse("India"));
	    }
	}


