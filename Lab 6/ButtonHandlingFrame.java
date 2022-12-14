import java.awt.*;
import java.awt.event.*;
class ButtonHandlingFrame extends Frame implements ActionListener
{
	TextField tf;
	Button b1,b2;
	ButtonHandlingFrame()
	{
		setLayout(null);
		tf =new TextField(40);
		add(tf);
		b1 = new Button("First");
		b1.addActionListener(this);
		b2 = new Button("Second");
		b2.addActionListener(this);
		add(b1); add(b2);
		tf.setBounds(70,90,160,20);
		b1.setBounds(70,130,70,20);
		b2.setBounds(70,190,70,20);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		tf.setText("First button pressed");
		else
		tf.setText("Second button pressed");
	}
	public static void main(String args[])
	{
		Frame f = new ButtonHandlingFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setTitle("My First Login Window");
	}
}
