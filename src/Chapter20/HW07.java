package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW07 extends Frame implements ActionListener{
	static HW07 frm=new HW07();
	static Button btn1=new Button("Brighter");
	static Button btn2=new Button("Darker");
	static Label lab=new Label();
	int r=203,g=105 ,b=150;
	Color co=new Color(r,g,b);
	int n=20;
	
	public static void main(String args[])
	{
frm.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0);}});
		

		frm.setTitle("Brighter&Darker");frm.setLayout(new FlowLayout());
		frm.setSize(200,150);
			
		frm.add(btn1);frm.add(btn2);frm.add(lab);
		btn1.addActionListener(frm);btn2.addActionListener(frm);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	Button btn=(Button)e.getSource();
	r=co.getRed();g=co.getGreen();b=co.getBlue();
		
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
		if((r-n)>=0 && (g-n)>=0 && (b+n)>=0)
		r=r-n;g=g-n;b=b-n;
		}
	}
	co=new Color(r,g,b);
	Graphics gr=getGraphics();
	paint(gr);
	}
	catch(Exception f) {};//抓取小於0或大於255的情況
	}
	public void paint(Graphics gr)
	{	
		String str="R="+r+", G="+g+", B="+b;
		gr.setColor(co);
		gr.fillRect(0, 0, getWidth(), getHeight());
		gr.setColor(Color.black);
		gr.setFont(new Font("Comic Sans Ms",Font.PLAIN,14));
		gr.drawString(str, 30, 90);
	}
	
}