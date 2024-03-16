class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }
}

public class thread_priorities {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Set priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority

        // Start threads
        thread1.start();
        thread2.start();
    }
}
