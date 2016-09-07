import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AppletCalculator extends JApplet implements ActionListener{

	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	
	public void init() {
		// TODO Auto-generated method stub
		l1 = new JLabel("Enter No:1");
		l2 = new JLabel("Enter No:2");
		l3 = new JLabel("Result");
		
		setLayout(new GridLayout(5, 2));
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		
		b1 = new JButton("Sum");
		b2 = new JButton("Subtraction");
		b3 = new JButton("Multiplication");
		b4 = new JButton("Division");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		add(b3);add(b4);
	//	super.init();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		if(e.getActionCommand().equalsIgnoreCase("Sum")){
			t3.setText(new Float(n1+n2).toString());
		}
		if(e.getActionCommand().equalsIgnoreCase("Subtraction")){
			t3.setText(new Float(n1-n2).toString());
		}
		
		if(e.getSource().equals(b3))
		{
			t3.setText(new Float(n1*n2).toString());
		}
		if(e.getSource().equals(b4))
		{
			t3.setText(new Float(n1/n2).toString());
		}
	}
}
