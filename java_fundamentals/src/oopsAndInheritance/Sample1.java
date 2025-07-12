package oopsAndInheritance;

public class Sample1 {
	    double width, height, depth;

	    // Parameterized constructor
	    Sample1(double width, double height, double depth) {
	        this.width = width;
	        this.height = height;
	        this.depth = depth;
	    }

	    // Method to calculate volume
	    double getVolume() {
	        return width * height * depth;
	    }

	    public static void main(String[] args) {
	        // Creating object of Box class
	        Sample1 box1 = new Sample1(5, 3, 2);
	        System.out.println("Volume of the box: " + box1.getVolume());
	    }
	}



