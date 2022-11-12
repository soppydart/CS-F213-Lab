import java.awt.*;
import java.awt.event.*;
class AddFrame extends Frame implements ActionListener
{
	TextField tf1, tf2, tf3;
	Label num1, num2;
	Button addButton;
	AddFrame()
	{
		setLayout(null);
		num1 = new Label("Input first integer : ", Label.LEFT);
		num2 = new Label("Input second integer : ", Label.LEFT);
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);
		addButton = new Button("ADD");
		addButton.addActionListener(this);
		add(num1);add(num2);add(tf1);add(tf2);add(tf3);add(addButton);
		num1.setBounds(70, 90, 150, 60);
		num2.setBounds(70, 130, 150, 60);
		tf1.setBounds(230, 110, 100, 20);
		tf2.setBounds(230, 150, 100, 20);
		addButton.setBounds(70, 260, 70, 40);
		tf3.setBounds(230, 270, 100, 20);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			tf3.setText(Integer.toString(a+b));
		}
		catch(NumberFormatException nfe)
		{
			tf3.setText("INVALID INPUT");
		}
	}
	public static void main(String args[])
	{
		AddFrame af = new AddFrame();
		af.setSize(400, 400);
		af.setVisible(true);
		af.setTitle("Add Frame");
	}
}
		
