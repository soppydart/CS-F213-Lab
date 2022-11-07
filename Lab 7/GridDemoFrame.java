import java.awt.*;
import java.awt.event.*;
class GridDemoFrame extends Frame
{
	GridDemoFrame()
	{
		setLayout(new GridLayout(3,2));    //3 rows, 2 columns
		Button b1,b2,b3,b4,b5,b6,b7;
		b1 = new Button("ONE");
		b2 = new Button("TWO");
		b3 = new Button("THREE");
		b4 = new Button("FOUR");
		b5 = new Button("FIVE");
		b6 = new Button("SX");
		b7 = new Button("SEVEN");
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
	}
	public static void main(String args[])
	{
		Frame f = new GridDemoFrame();
		f.setTitle("GridLayout Demo Frame");
		f.setSize(500,500);
		f.setVisible(true);
	}
}
