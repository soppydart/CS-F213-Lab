import java.awt.*;
import java.awt.event.*;
public class BLDemoFrame extends Frame
{
	Button b1,b2,b3,b4,b5;
	BLDemoFrame()
	{
		setLayout(new BorderLayout());
		b1 = new Button("ONE");
		b2 = new Button("TWO");
		b3 = new Button("THREE");
		b4 = new Button("FOUR");
		b5 = new Button("FIVE");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		Frame f = new BLDemoFrame();
		f.setTitle("BorderLayout Demo Frame");
		f.setSize(500,500);
		f.setVisible(true);
	}
}
