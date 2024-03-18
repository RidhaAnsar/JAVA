class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(500); // Suspend the thread for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadusingRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for all threads to finish execution
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}
