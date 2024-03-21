class Staff {
    String code;
    String name;

    Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }
}

// Derived class from Staff
class Typist extends Staff {
    String office;
    int speed;

    Typist(String code, String name, String office, int speed) {
        super(code, name);
        this.office = office;
        this.speed = speed;
    }
}

// Derived class from Staff
class Faculty extends Staff {
    String department;
    String subjectTaken;
    String researchArea;

    Faculty(String code, String name, String department, String subjectTaken, String researchArea) {
        super(code, name);
        this.department = department;
        this.subjectTaken = subjectTaken;
        this.researchArea = researchArea;
    }
}

// Derived class from Staff
class Officer extends Staff {
    String rank;
    String grade;

    Officer(String code, String name, String rank, String grade) {
        super(code, name);
        this.rank = rank;
        this.grade = grade;
    }
}

// Derived class from Faculty
class Permanent extends Faculty {
    double salary;

    Permanent(String code, String name, String department, String subjectTaken, String researchArea, double salary) {
        super(code, name, department, subjectTaken, researchArea);
        this.salary = salary;
    }
}

// Derived class from Faculty
class Casual extends Faculty {
    double dailyWages;

    Casual(String code, String name, String department, String subjectTaken, String researchArea, double dailyWages) {
        super(code, name, department, subjectTaken, researchArea);
        this.dailyWages = dailyWages;
    }
}

public class inheritancemain{
    public static void main(String[] args) {
        Typist typist = new Typist("T001", "John Doe", "Administration", 60);
        Permanent permanent = new Permanent("F001", "Jane Smith", "Computer Science", "Data Structures", "Algorithms", 50000.0);
        Casual casual = new Casual("F002", "Bob Johnson", "Mathematics", "Calculus", "Analysis", 500.0);
        Officer officer = new Officer("O001", "Alice Williams", "Lieutenant", "Grade 3");

        // You can access and manipulate the objects as needed
        System.out.println("Typist: " + typist.name + ", Office: " + typist.office);
        System.out.println("Permanent Faculty: " + permanent.name + ", Salary: " + permanent.salary);
        System.out.println("Casual Faculty: " + casual.name + ", Daily Wages: " + casual.dailyWages);
        System.out.println("Officer: " + officer.name + ", Rank: " + officer.rank);
    }
}

