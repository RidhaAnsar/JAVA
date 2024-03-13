//Create a login frame using Panel

import java.awt.*;
import java.awt.event.*;
class Pframe extends Frame {
	Label lh, lu, lp;
	TextField t;
	Button bl;
	Panel p;

public Pframe () {
	super("panel demo");
	lh=new Label("login");
	lu=new Label("Username");
	lp=new Label("password");

	tu=new TextField(10);
	tp=new TextField(10);
	bl=new Button("LOGIN");
	tp.setEchoChar("*");

	setLayout(new GridLayout(3,1));

	add(lh);
	p=new Panel();
	p.setLayout(new GridLayout(2,2));
	p.add(lu);
	p.add(tu);
	p.add(lp);
	p.add(tp);
	add(p);
	add(bl);

	setSize(600, 600);
	setVisible(true);
	}
public static void main(String args[]) {
	Pframe obj=new Pframe();
	}
    }