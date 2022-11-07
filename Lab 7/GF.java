import java.awt.*;
import java.awt.event.*;
public class GF extends Frame
{
	public void paint(Graphics g)
	{
		Font f = new Font("TimesRoman", Font.BOLD, 30);
		g.setFont(f);
		g.drawString("Hello",100,100);   //(100,100) are the coordinates of the top left corner of the rectangle that contains the string "Hello"
		g.drawRect(100,150,60,20);
	}
	public static void main(String args[])
	{
		Frame f = new GF();
		f.setBackground(Color.yellow);
		f.setSize(600,600);
		f.setVisible(true);
	}
}
