import java.awt.*;
import java.awt.event.*;
class WindowClosingFrame extends Frame
{
	Button b1,b2;
	WindowClosingFrame()
	{
		setLayout (new FlowLayout());
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		addWindowListener(new WL());
		add(b1);
		add(b2);
	}
	class WL extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing...");
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		Frame f = new WindowClosingFrame();
		f.setSize(300,200);
		f.setVisible(true);
	}
}
