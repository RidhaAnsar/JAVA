import java.awt.*;
import java.awt.event.*;

class cmenu extends Frame implements ActionListener {
    MenuBar mb;
    Menu f, h, a;
    MenuItem n, s, e, m, sw;
    TextArea t;

    public cmenu() {
        super("menu demo..");
        mb = new MenuBar();
        f = new Menu("file");
        h = new Menu("about");
        a = new Menu("help");

        n = new MenuItem("new");
        s = new MenuItem("save");
        e = new MenuItem("exit");
        m = new MenuItem("Me");
        sw = new MenuItem("software");

        n.addActionListener(this);
        s.addActionListener(this);
        e.addActionListener(this);
        m.addActionListener(this);
        sw.addActionListener(this);

        t = new TextArea();
        add(t);
        f.add(n);
        f.add(s);
        f.add(e);

        a.add(m);
        a.add(sw);

        h.add(a);
        mb.add(f);
        mb.add(h);
        setMenuBar(mb);
        setSize(400, 400);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == n) {
            t.setText(""); // Clear text area
        } else if (ae.getSource() == s) {
            t.setText("save clicked");
        } else if (ae.getSource() == e) {
            System.exit(0);
        } else if (ae.getSource() == m) {
            t.setText("Your name");
        } else if (ae.getSource() == sw) {
            t.setText("Menu ver 0.0.1");
        }
    }

    public static void main(String args[]) {
        // Check if the environment is headless
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Headless environment detected. Exiting...");
            System.exit(1);
        }

        // Create an instance of cmenu class
        cmenu obj = new cmenu();
    }
}

public class mmenu {
    public static void main(String args[]) {
        // Check if the environment is headless
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Headless environment detected. Exiting...");
            System.exit(1);
        }

        // Create an instance of cmenu class
        cmenu obj = new cmenu();
    }
}
