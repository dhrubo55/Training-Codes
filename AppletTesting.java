import java.applet.Applet;
import java.awt.Graphics;

public class AppletTesting extends Applet{

	int x,y;
	
	public void init() {
		// TODO Auto-generated method stub
		x=100;
		y=200;
		System.out.println("Init called");
	//	super.init();
	}
	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start called");
	//	super.start();
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy called");
	//	super.destroy();
	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawLine(x, y, 200, 200);
		g.drawOval(x, y, 200, 200);
		
		g.drawString("Learing Applet", 200, 200);
		
	//	super.paint(arg0);
	}
}
