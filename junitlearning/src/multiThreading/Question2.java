package multiThreading;

import java.util.Random;

class ColorDisplayTask implements Runnable {
    private final String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    private final Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String selectedColor = colours[index];
            System.out.println("Color: " + selectedColor);

            if (selectedColor.equals("red")) {
                System.out.println("Red detected! Stopping display.");
                break;
            }

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Thread colorThread = new Thread(new ColorDisplayTask());
        colorThread.start();
    }
}
