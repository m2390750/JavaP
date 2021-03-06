package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW06 extends Frame implements ActionListener{
	static HW06 frm=new HW06();
	static Button btn1=new Button("Brighter");
	static Button btn2=new Button("Darker");
	static Label lab=new Label();
	static Color co;
	int n=20;
	
	public static void main(String args[])
	{
frm.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0);}});
		
	int r=203,g=105 ,b=150;
	co=new Color(r,g,b);
		frm.setTitle("Brighter&Darker");frm.setLayout(new FlowLayout());
		frm.setSize(200,150);
		
		String str="R="+r+", G="+g+", B="+b;
		
		lab.setText(str);
		frm.add(btn1);frm.add(btn2);frm.add(lab);
		btn1.addActionListener(frm);btn2.addActionListener(frm);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int r,g,b;
	Button btn=(Button)e.getSource();
	r=co.getRed();g=co.getGreen();b=co.getBlue();
	String str="R="+r+", G="+g+", B="+b;
	lab.setText(str);
	try {
	if(btn==btn1)
	{			
		{
		if((r+n)<=255 && (g+n)<=255 && (b+n)<=255)
		r=r+n;g=g+n;b=b+n;
		}
	}
	else if(btn==btn2)
	{
		{
		if((r-n)>=0 && (g-n)>=255 && (b+n)<=255)
		r=r-n;g=g-n;b=b-n;
		}
	}
	co=new Color(r,g,b);
	Graphics gr=getGraphics();
	paint(gr);
	}
	catch(Exception f) {System.out.println(f);};//抓取小於0或大於255的情況
	}
	public void paint(Graphics g)
	{
		g.setColor(co);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
}