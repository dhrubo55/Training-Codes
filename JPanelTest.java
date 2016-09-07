import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class JPanelTest extends JFrame implements ActionListener{

	JButton eb1,eb2;
	JPanel emp_Panel;
	JLabel el1,el2,el3;
	JTextField et1,et2;
	JPasswordField et3;
	
	
	JButton db1,db2;
	JPanel dep_Panel;
	JLabel dl1,dl2,dl3;
	JTextField dt1,dt2;
	JPasswordField dt3;
	
	public JPanelTest()
	{
		
		el1 = new JLabel("Enter Name");
		el2 = new JLabel("Enter ID");
		el3 = new JLabel("Enter Password");
		
		et1 = new JTextField(12);
		et2 = new JTextField(12);
		et3 = new JPasswordField(12);
		eb1 = new JButton("Send");
		eb2 = new JButton("Reset");
		eb1.addActionListener(this);
		eb2.addActionListener(this);
		
		JLabel emp_label = new JLabel("Employee INFO");
		emp_label.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
		emp_label.setForeground(Color.RED);
		
		emp_Panel = new JPanel(new GridLayout(5,2));
		emp_Panel.add(emp_label);
		
		emp_Panel.add(new JLabel());
		
		emp_Panel.add(el1);	emp_Panel.add(et1);
		emp_Panel.add(el2); emp_Panel.add(et2);
		emp_Panel.add(el3); emp_Panel.add(et3);
		emp_Panel.add(eb1); emp_Panel.add(eb2);
		
	
		emp_Panel.setBackground(Color.pink);
		
		
		
		dl1 = new JLabel("Enter Name");
		dl2 = new JLabel("Enter ID");
		dl3 = new JLabel("Enter Password");
		
		dt1 = new JTextField(12);
		dt2 = new JTextField(12);
		dt3 = new JPasswordField(12);
		db1 = new JButton("Send");
		db2 = new JButton("Reset");
		db1.addActionListener(this);
		db2.addActionListener(this);
		
		JLabel dep_label = new JLabel("Department INFO");
		dep_label.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
		dep_label.setForeground(Color.BLUE);
		
		dep_Panel = new JPanel(new GridLayout(5,2));
		dep_Panel.add(dep_label);
		
		dep_Panel.add(new JLabel());
		
		dep_Panel.add(dl1);	dep_Panel.add(dt1);
		dep_Panel.add(dl2); dep_Panel.add(dt2);
		dep_Panel.add(dl3); dep_Panel.add(dt3);
		dep_Panel.add(db1); dep_Panel.add(db2);
		dep_Panel.setBackground(Color.blue);
		dep_label.setForeground(Color.RED);
		
		add(emp_Panel,"North");
		add(dep_Panel,"South");
		setVisible(true);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = "",s2="",s3 = "";
		if(e.getSource()==eb2)
		{
			et1.setText("");
			et2.setText("");
			et3.setText("");
		}
		if(e.getSource()==eb1)
		{
			s1=et1.getText();
			s2=et2.getText();
			s3=et3.getText();
		}
		
		if(s1.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Name is empty");
		}
		else if(s2.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "ID is empty");
		}
		else if(s3.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "password is empty");
		}
		else
		{
			new EmpImprove(s1, s2);this.dispose();
		}
		
		
	}
}
