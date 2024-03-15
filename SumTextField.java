import java.awt.*;
import java.awt.event.*;

public class SumTextField extends Frame implements ActionListener {
 
    Button bSum;
    TextField t1, t2;

    public SumTextField() {
        super("Sum of 2 numbers");
        t1 = new TextField(10);
        t2 = new TextField(10);
        bSum = new Button("Sum");
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(bSum);
        bSum.addActionListener(this);
        setSize(500, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bSum) {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter valid integers.");
            }
        }
    }

    public static void main(String[] args) {
        new SumTextField();
    }
}
