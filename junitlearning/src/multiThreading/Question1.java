package multiThreading;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);  // Assign thread name
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + getName());
    }
}

public class Question1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Scooby");
        MyThread t2 = new MyThread("Shaggy");

        t1.start();
        t2.start();
    }
}

