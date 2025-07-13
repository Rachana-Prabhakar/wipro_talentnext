package oopsAndInheritance;
interface Test {
    int myfunction(int a, int b, int c);
}

public class Question14 {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Sum: " + t1.myfunction(2, 3, 4));
        System.out.println("Product: " + t2.myfunction(2, 3, 4));
    }
}


