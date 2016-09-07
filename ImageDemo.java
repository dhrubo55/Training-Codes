import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ImageDemo extends JFrame{

	ImageIcon ic,ic1;
	public ImageDemo()
	{
//		ic = new ImageIcon("BabyTux.png");
//		add(new JLabel(ic),"North");
		
		ic1 = new ImageIcon("tomcat.gif");
		add(new JLabel(ic1),"South");
		
		setLayout(new GridLayout(5,4));
		
		for (int i = 0; i <11; i++) {
			add(new JLabel(ic1));
		}
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ImageDemo();
	}
}
