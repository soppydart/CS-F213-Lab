import java.awt.*;
import java.awt.event.*;
class ChoiceDemo1
{
	String s; 
	Label l1, l2;
	ChoiceDemo1()
	{
		Frame f = new Frame();
		l1 = new Label("Select Item:");
		l1.setBounds(100,250,90,20);
		l2 = new Label("You selected nothing");
		l2.setBounds(100,300,200,20);
		Choice c = new Choice();
		c.setBounds(100,100,150,40);
		c.add("Books");
		c.add("Bags");
		c.add("Phones");
		c.add("Pens");
		c.add("Cards");
		c.addItemListener(new Choice1());
		f.add(c);
		f.add(l1);
		f.add(l2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public class Choice1 implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			s = (String)e.getItem();
			l2.setText("You selected: "+s);
		}
	}
	public static void main(String args[])
	{
		new ChoiceDemo1();
	}
}
