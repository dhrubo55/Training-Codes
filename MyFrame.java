import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame{

	public MyFrame()
	{
		String s[] = {"North","South","East","West","Center"};
		setTitle("My 1st Frame");
		setLocation(300,300);
		setLayout(new FlowLayout());
		//setLayout(new GridLayout());
		//setLayout(new GridLayout(3, 2));
		Container c = getContentPane();
		c.setBackground(Color.black);
		c.setForeground(Color.WHITE);
		for (int i = 0; i <5; i++) {
			add(new JButton("button "+i),s[i]);
			//add(new JButton(s[i]),s[i]);
		}
		
		pack();
		//setSize(200, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
