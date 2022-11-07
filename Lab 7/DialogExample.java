import java.awt.*;
import java.awt.event.*;
public class DialogExample
{
	private static Dialog d;
	Label l;
	Button b1;
	DialogExample()
	{
		Frame f = new Frame("Main Frame");
		f.setLayout(null);
		b1 = new Button("Main Button");
		b1.setBounds(100,50,100,40);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				DialogExample.d.setVisible(true);
			}
		});
		f.add(b1);
		d = new Dialog(f, "Dialog Example", true);  //true is for modal dialog box(cannot focus on any other part except the dialog box), false is 
													//for modless dialog box
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				DialogExample.d.setVisible(false);
			}
		});
		l = new Label("Click button to continue");
		d.add(l);
		d.add(b);
		d.setSize(300,300);
		d.setVisible(false);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new DialogExample();
	}
}
