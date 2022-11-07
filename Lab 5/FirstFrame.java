import java.awt.*;
import java.awt.event.*;
public class FirstFrame extends Frame
{
	Button b1,b2;
	public FirstFrame()
	{
		addWindowListener(new WL()); // or   addWindowListener(new WL1());
	}
	class WL extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing");
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		Frame f = new FirstFrame();
		f.setSize(200,300);
		f.setVisible(true);
	}
}
class WL1 implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window Closing");
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
	 	
