import java.awt.*;
class NullLayoutDemo extends Frame
{
	TextField name, pass;
	Button b1;
	Label msg,n,p;
	NullLayoutDemo()
	{
		setLayout(null);
		n = new Label("NAME:", Label.CENTER);
		p = new Label("PASSWORD:", Label.CENTER);
		msg = new Label("Please Login", Label.CENTER);
		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('$');
		b1 = new Button("SUBMIT");
		add(n); add(name); add(p); add(msg); add(pass); add(b1);
		n.setBounds(70,90,90,60);
		p.setBounds(70,130,90,60);
		name.setBounds(200,100,90,20);
		pass.setBounds(200,140,90,20);
		b1.setBounds(50,260,70,40);
		msg.setBounds(150,260,90,20);
	}
	public static void main(String args[])
	{
		NullLayoutDemo nd = new NullLayoutDemo();
		nd.setVisible(true);
		nd.setSize(400,400);
		nd.setTitle("Frame with Null Layout");
	}
}
