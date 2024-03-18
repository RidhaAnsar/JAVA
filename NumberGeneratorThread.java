import java.util.Random;

class NumberGenerator extends Thread {
    private final Random random = new Random();

    @Override
    public void run() {
        try {
            while (true) {
                int num = random.nextInt(100); // Generate a random integer between 0 and 99
                System.out.println("Generated number: " + num);

                if (num % 2 == 0) {
                    SquareThread squareThread = new SquareThread(num);
                    squareThread.start();
                } else {
                    CubeThread cubeThread = new CubeThread(num);
                    cubeThread.start();
                }

                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SquareThread extends Thread {
    private final int number;

    public SquareThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class CubeThread extends Thread {
    private final int number;

    public CubeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class NumberGeneratorThread {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }
}
