import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Applet3 extends Applet {

	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	public void init() {
		// TODO Auto-generated method stub
		
		l1=new Label("Enter id ");
		l2=new Label("Enter Name");
		
		t1=new TextField(12);
		t2=new TextField(12);
		
		b1=new Button("Ok");
		b2=new Button("Cancel");
		
		setLayout(new GridLayout(3, 2));
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
		
		setSize(200, 80);
		setLocation(150, 100);
		
//		System.out.println(t1.getText());
//		System.out.println(t2.getText());
	//	super.init();
	}
}
