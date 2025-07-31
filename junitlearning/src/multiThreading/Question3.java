package multiThreading;

class NumberPrinter extends Thread {
   
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); // 5-second delay
                } catch (InterruptedException e) {
                    System.out.println("Interrupted at 5");
                }
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();
    }
}

