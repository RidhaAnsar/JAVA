import java.io.*;
public class Time {
    private int hours;
    private int minutes;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    // Parameterized constructor with hours and minutes
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Copy constructor
    public Time(Time otherTime) {
        this.hours = otherTime.hours;
        this.minutes = otherTime.minutes;
    }

    // Member function to sum two Time objects
    public Time sum(Time otherTime) {
        Time result = new Time();
        result.minutes = this.minutes + otherTime.minutes;
        result.hours = this.hours + otherTime.hours + result.minutes / 60;
        result.minutes %= 60;
        return result;
    }

    // Method to display the time
    public void display() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }

    public static void main(String[] args) {
        // Create three Time objects
        Time time1 = new Time(2, 30);
        Time time2 = new Time(1, 45);
        Time time3;

        // Display initial values
        System.out.println("Initial values:");
        time1.display();
        time2.display();

        // Sum two Time objects and assign it to the third object
        time3 = time1.sum(time2);

        // Display the result
        System.out.println("\nAfter summing:");
        time3.display();
    }
}
