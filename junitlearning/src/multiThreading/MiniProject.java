package multiThreading;

class Race implements Runnable {
    String name;
    static boolean raceOver = false;

    Race(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (raceOver) break;

            System.out.println(name + " ran " + i + " meters");

            if (name.equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }

            if (i == 100 && raceOver == false) {
                raceOver = true;
                System.out.println(name + " wins the race!");
            }
        }
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Race hareObj = new Race("Hare");
        Race tortoiseObj = new Race("Tortoise");

        Thread hare = new Thread(hareObj);
        Thread tortoise = new Thread(tortoiseObj);

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}
