// Interface P
interface P {
    int CONSTANT_P = 10; // Constant in interface P

    void methodP(); // Method in interface P
}

// Interface P1 extending P
interface P1 extends P {
    int CONSTANT_P1 = 20; // Constant in interface P1

    void methodP1(); // Method in interface P1
}

// Interface P2 extending P
interface P2 extends P {
    int CONSTANT_P2 = 30; // Constant in interface P2

    void methodP2(); // Method in interface P2
}

// Interface P12 inheriting from both P1 and P2
interface P12 extends P1, P2 {
    // No additional constants or methods
}

// Class Q implementing P12
class Q implements P12 {
    // Implementing methods from P12 interface
    @Override
    public void methodP() {
        System.out.println("Constant from P: " + CONSTANT_P);
    }

    @Override
    public void methodP1() {
        System.out.println("Constant from P1: " + CONSTANT_P1);
    }

    @Override
    public void methodP2() {
        System.out.println("Constant from P2: " + CONSTANT_P2);
    }
}

// Main class
public class interfaceP {
    public static void main(String[] args) {
        // Instantiate Q
        Q q = new Q();

        // Invoke each method of Q to display constants
        q.methodP();
        q.methodP1();
        q.methodP2();
    }
}
