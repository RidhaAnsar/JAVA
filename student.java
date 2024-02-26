import java.io.*;
class Performance {
    private int[] marks;

    // Constructor
    public Performance() {
        marks = new int[10];
    }

    // Method to read marks into the array
    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for 10 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to return the highest mark scored in the class
    public int highestMark() {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Method to return the least mark scored in the class
    public int leastMark() {
        int least = marks[0];
        for (int mark : marks) {
            if (mark < least) {
                least = mark;
            }
        }
        return least;
    }

    // Method to return the mode
    public int getMode() {
        int[] frequency = new int[101]; // Assuming marks range from 0 to 100
        for (int mark : marks) {
            frequency[mark]++;
        }

        int mode = marks[0];
        int modeFrequency = frequency[mode];

        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > modeFrequency || (frequency[i] == modeFrequency && i > mode)) {
                mode = i;
                modeFrequency = frequency[i];
            }
        }

        return mode;
    }

    // Method to return the frequency at mode
    public int getFreqAtMode() {
        int mode = getMode();
        int modeFrequency = 0;
        for (int mark : marks) {
            if (mark == mode) {
                modeFrequency++;
            }
        }
        return modeFrequency;
    }

    // Method to display the result
    public void display() {
        System.out.println("Highest Mark: " + highestMark());
        System.out.println("Least Mark: " + leastMark());
        System.out.println("Mode: " + getMode());
        System.out.println("Mode Frequency: " + getFreqAtMode());
    }
}

public class student {
    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.readMarks();
        performance.display();
    }
}