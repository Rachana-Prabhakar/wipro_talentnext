package collections;
import java.util.ArrayList;
public class Question4 {
	

	    public static void main(String[] args) {
	        ArrayList<Number> numberList = new ArrayList<>();

	        numberList.add(10);       // int
	        numberList.add(20.5f);    // float
	        numberList.add(30.7);     // double

	        for (Number num : numberList) {
	            System.out.println(num);
	        }
	    }
	}



