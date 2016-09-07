import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestJCheckBox extends JFrame implements ItemListener {
	JCheckBox box1, box2, box3;

	public TestJCheckBox() {
		box1 = new JCheckBox("Swimming");
		box2 = new JCheckBox("Reading");
		box3 = new JCheckBox("Being Lazy");

		setLayout(new GridLayout());
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		add(box1);
		add(box2);
		add(box3);

		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestJCheckBox();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getItem() == box1) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				JOptionPane.showMessageDialog(this,
						"You Like " + box1.getText());
			}
		}
		if (e.getItem() == box2) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				JOptionPane.showMessageDialog(this,
						"You Like " + box2.getText());
			}
		}
		if (e.getItem() == box3) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				JOptionPane.showMessageDialog(this,
						"You Like " + box3.getText());
			}
		}
	}
}
