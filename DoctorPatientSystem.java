import java.util.Scanner;

// Doctor class
class Doctor {
    private String name;
    private String specialization;

    // Constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display doctor information
    public void displayInfo() {
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

// Patient class
class Patient {
    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Method to display patient information
    public void displayInfo() {
        System.out.println("Patient: " + name);
    }

    // Method for patient to describe symptoms
    public String describeSymptoms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter symptoms: ");
        String symptoms = scanner.nextLine();
        scanner.close();
        return symptoms;
    }
}

public class DoctorPatientSystem {
    public static void main(String[] args) {
        // Create a doctor and display info
        Doctor doctor = new Doctor("Dr. Smith", "General Physician");
        doctor.displayInfo();

        // Create a patient, display info, and describe symptoms
        Patient patient = new Patient("Alice");
        patient.displayInfo();
        String symptoms = patient.describeSymptoms();

        // Display patient symptoms
        System.out.println("Patient symptoms: " + symptoms);
    }
}
