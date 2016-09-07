import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
/*<applet width="400" height="400" code="ImageApplet.class">
<param name="roll" value="1001">
<param name="name" value="Dhrubo">
<param name=
</applet>
*/
public class ImageApplet extends Applet{

	int roll;
	String name;
   Image img1;
	public void init() {
	// TODO Auto-generated method stub
    img1 = getImage(getCodeBase(),"tomcat.gif");
	roll = Integer.parseInt(getParameter("roll"));
	name = getParameter("name");
		//super.init();
}
	public void paint(Graphics g) {
			// TODO Auto-generated method stub
		g.drawImage(img1,10,10,50,50, this);
		g.drawImage(img1,100,10,50,50,this);
		g.drawImage(img1,10,100,50,50,this);
		g.drawImage(img1,100,100,300,300,this);
		g.drawString("Roll Is: "+roll,100,200);
		g.drawString("Name is: "+name,100,220);
		showStatus("Image program is in applet");
		//super.paint(arg0);
		}
	
}
