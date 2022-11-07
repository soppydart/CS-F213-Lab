import java.awt.*;
class MyFrame extends Frame
{
	Button b1;
	TextField tf;
	Checkbox cb1,cb2,cb3;
	Choice subject;
	TextArea ta;
	List ls;
	Label l;
	MyFrame(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		b1 = new Button("ONE");
		l = new Label();
		l.setText("Buttons");
		cb1 = new Checkbox("book");
		cb2 = new Checkbox("bag");
		cb3 = new Checkbox("laptop");
		subject = new Choice();
		subject.add("OS");
		subject.add("DBMS");
		subject.add("ML");
		subject.add("OOP");
		ls = new List(3);
		ls.add("Ram");
		ls.add("Mohan");
		ls.add("John");
		ta = new TextArea(4,20);
		tf = new TextField(20);
		add(l);add(tf);add(b1);add(cb1);add(cb2);add(cb3);add(subject);add(ta);add(ls);
	}
	public static void main(String args[])
	{
		MyFrame mf = new MyFrame("MyFrame");
		mf.setSize(600,500);
		mf.setVisible(true);	
	}
}

