import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
	Button b;
	public void init()
	{
		b = new Button("OK");
		add(b);
	}
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		g.drawString("My First Applet", 20, 80);
	}
}
/*
	<applet code=MyApplet width=200	height=300>
	</applet>
*/
