package Chapter22;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class HW01 extends Frame implements ActionListener {
	
	static HW01 frm=new HW01();
	static Label lab=new Label();
	static Button btn1=new Button("Host name");
	static Button btn2=new Button("Host address");
	
	public static void main(String arsg[])
	{	frm.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e) {System.exit(0);}});
		frm.setSize(400,400);
		frm.setLayout(null);
		btn1.setBounds(20,50,90,20);
		btn2.setBounds(110,50,90,20);
		lab.setBounds(30,80,200,20);
		lab.setBackground(Color.gray);
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		
		frm.add(btn1);frm.add(btn2);frm.add(lab);
		frm.setVisible(true);
		
		
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{	
		InetAddress adr=null;
		try
			{
			adr=InetAddress.getLocalHost();
			}
		catch(UnknownHostException f)
		{}
		
		Button btn=(Button)e.getSource();
		if(btn==btn1)
			lab.setText(adr.getHostName());
		else if(btn==btn2)
			lab.setText(adr.getHostAddress());
	}
}
