package multiThreading;
class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
 
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        try {
            even.join(); // Wait for even thread to finish
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for even thread");
        }

        odd.start(); // Starts only after even thread finishes
    }
}

