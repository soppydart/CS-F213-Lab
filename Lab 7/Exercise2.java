import java.awt.*;
import java.awt.event.*;
class Exercise2 extends Frame implements ActionListener
{
	Label counter;
	TextField tf;
	Button count;
	int c;
	Exercise2(String s)
	{
		super(s);
		c = 0;
		setLayout(new FlowLayout());
		counter = new Label("Counter", Label.LEFT);
		count = new Button("Count");
		tf = new TextField(10);
		tf.setText(Integer.toString(c));
		tf.setEditable(false);
		add(counter);
		add(tf);
		add(count);
		count.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		c++;
		tf.setText(Integer.toString(c));
	}
	public static void main(String args[])
	{
		Exercise2 e2 = new Exercise2("AWT Counter");
		e2.setSize(300,100);
		e2.setVisible(true);
	}
}
