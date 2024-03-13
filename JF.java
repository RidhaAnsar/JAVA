import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JF extends JFrame implements ActionListener  {
	JButton b1;

public JF()  {
	super("swing demo");
	b1=new JButton("show");
	Container c=this.getContentPane();
	c.setLayout(new FlowLayout());
	c.add(b1);
	b1.addActionListener(this);
	setSize(700,700);
	setVisible(true);

public void actionPerformed(ActionEvent ae)
{
	System.exit(0);
}
public static void main(String args[]);
{
	new JF();
 }
}