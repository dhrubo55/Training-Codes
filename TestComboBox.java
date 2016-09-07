import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;


public class TestComboBox extends JFrame{
 
	JComboBox<String>city;
	JList<String>list1;
	public TestComboBox()
	{
		city = new JComboBox<String>(new String[]{"Dhaka","Rajshahi","Khulna","Barsial","Shylet"});
		list1 = new JList<String>(new String[]{"Java","Php","Ruby","C++"});
		
		add(city,"East");
		//add(list1,"West");
		add(list1,BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestComboBox();
	}
}
