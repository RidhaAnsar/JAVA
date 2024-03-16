class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start both threads
        oddThread.start();
        evenThread.start();

        try {
            // Main thread waits for both threads to finish
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting...");
    }
}
