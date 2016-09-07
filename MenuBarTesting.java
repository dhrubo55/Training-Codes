import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarTesting extends JFrame{

	
	String file[] = {"New","Open","Save","Close"};
	String edit[] = {"Cut","Copy","Paste","Preference"};
	String source[] = {"Toggle Comment","Shift Left","Shift Right","Format"};
	JMenuBar bar;
	JMenu m1,m2,m3;
	JMenuItem i1[],i2[],i3[];
	
	public MenuBarTesting()
	{
		bar = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Source");
		
		i1 = new JMenuItem[4];
		i2 = new JMenuItem[4];
		i3 = new JMenuItem[4];
		
		
		for (int i = 0; i < 4; i++) {
			i1[i] = new JMenuItem(file[i]);
			m1.add(i1[i]);
		}
		
		
		for (int i = 0; i < 4; i++) {
			i2[i] = new JMenuItem(edit[i]);
			m2.add(i2[i]);
		}
		
		
		for (int i = 0; i < 4; i++) {
			i3[i] = new JMenuItem(source[i]);
			m3.add(i3[i]);
		}
		
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		
		add(bar,"North");
		
		setVisible(true);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuBarTesting();
	}
}
