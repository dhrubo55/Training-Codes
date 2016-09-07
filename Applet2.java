import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet2 extends Applet{

	int x=10,y=10;
	
	Color color [] = {Color.RED,Color.YELLOW,Color.blue};
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int x1=0;
		for(int i=0; i<3; i++)
		{
			g.setColor(color[i]);
			g.fillOval(x, y, 100, 120);
			g.draw3DRect(x, y, 300, 400, true);
			x+=10;
			y+=10;
		}
	//	super.paint(arg0);
	}
}
