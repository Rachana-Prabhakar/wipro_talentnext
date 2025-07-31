package multiThreading;
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - count: " + i);
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("High Priority Thread");
        PriorityThread t2 = new PriorityThread("Low Priority Thread");
        PriorityThread t3 = new PriorityThread("Normal Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.MIN_PRIORITY);   // 1
        t3.setPriority(Thread.NORM_PRIORITY);  // 5

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}

