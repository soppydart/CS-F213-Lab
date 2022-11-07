import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	Button b1,b2,b3;
	Label l;
	MyFrame(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		b1 = new Button("ONE");
		b2 = new Button("TWO");
		b3 = new Button("THREE");
		l = new Label();
		l.setText("Buttons");
		add(l);
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		MyFrame mf = new MyFrame("MyFrame");
		mf.setSize(400,500);
		mf.setVisible(true);
	}
}
