import java.awt.*;
import java.awt.event.*;
class Exercise1 extends Frame implements ActionListener
{
	Label name, pass, result;
	TextField tf1, tf2;
	Button submit;
	Exercise1()
	{
		setLayout(null);
		name = new Label("NAME : ", Label.CENTER);
		pass = new Label("PASSWORD : ", Label.CENTER);
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf2.setEchoChar('$');
		submit = new Button("SUBMIT");
		result = new Label("");
		add(name); add(pass); add(tf1); add(tf2); add(submit); add(result);
		name.setBounds(50, 90, 150, 60);
		pass.setBounds(50, 130, 150, 60);
		tf1.setBounds(230, 110, 100, 20);
		tf2.setBounds(230, 150, 100, 20);
		submit.setBounds(80, 260, 70, 40);
		result.setBounds(250, 270, 100, 20);
		submit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if((tf1.getText()).equals("bits") && (tf2.getText()).equals("bitspilani"))
		result.setText("SUCCESS!");
		else
		result.setText("FAILED!");
	}
	public static void main(String args[])
	{
		Exercise1 e1 = new Exercise1();
		e1.setSize(400, 400);
		e1.setVisible(true);
		e1.setTitle("My First Login Window");
	}
}
