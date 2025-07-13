package oopsAndInheritance;

public class Sample13 {
    private double height;
    private double width;
    private double breadth;

    public Sample13(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void displayDetails() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {
       Sample13 c = new Sample13(10.5, 7.2, 5.0);
        c.displayDetails();
    }
}

