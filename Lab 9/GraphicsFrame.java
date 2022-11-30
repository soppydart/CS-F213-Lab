import java.awt.*;
import java.awt.event.*;
public class GraphicsFrame extends Frame
{
	Button b1;
	boolean status;
	GraphicsFrame()
	{
		status = false;
		setBackground(Color.yellow);
		setTitle("Graphics Frame");
		setLayout(null);
		b1 = new Button("DrawRect");
		b1.setBounds(50,400,100,30);
		add(b1);
		b1.addActionListener(new B1());
	}
	public void paint(Graphics g)
	{
		if(status)
		g.drawRect(100,100,200,80);
	}
	public void draw()
	{
		status = true;
		repaint();
	}
	public class B1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			draw();
		}
	}
	public static void main(String args[])
	{
		Frame f = new GraphicsFrame();
		f.setSize(600,600);
		f.setVisible(true);
	}
}
