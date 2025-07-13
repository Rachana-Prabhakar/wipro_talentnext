package oopsAndInheritance;
interface transport{
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside Fourwheeler");
    }
}

class Car implements transport, FourWheeler {
    @Override
    public void message() {
        transport.super.message();
        FourWheeler.super.message();
        System.out.println("Inside Car");
    }
}

public class Sample15 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
