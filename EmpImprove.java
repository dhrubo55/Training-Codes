import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class EmpImprove extends JFrame{

	JLabel l1,l2,l3,l4;
	
	public EmpImprove(String id, String name)
	{
		setLayout(new GridLayout(2, 2));
		l1 = new JLabel("Name is");
		l2 = new JLabel(id);
		
		l3 = new JLabel("ID is");
		l4 = new JLabel(name);
		
		add(l1);add(l2);
		add(l3);add(l4);
		
		setVisible(true);
		//setSize(300,400);
		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
