package Chapter19;
import java.awt.*;
import java.awt.event.*;
public class HW06 extends Frame implements ItemListener{
	static HW06 frm=new HW06();
	static Label lab=new Label();
	static Choice lst=new Choice();
	
	public static void main(String args[])
	{
		
		frm.setTitle("Frame");
		

		
		frm.setLayout(null);
		
		lst.add("Dialog");
		lst.add("Monspaced");
		lst.add("SansSerif");
		lst.add("Serif");
		lab.setBackground(Color.yellow);
		
		lst.setBounds(20, 40, 100, 100);
		lab.setBounds(25, 150,150, 20);
		frm.setSize(200,150);
		frm.add(lst);
		frm.add(lab);
		frm.setBackground(Color.orange);
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		lst.addItemListener(frm);
		
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
	String selct=lst.getSelectedItem();
	if(selct=="Dialog")
	{
	Font fnt=new Font("Dialog",Font.ITALIC+Font.BOLD,16);
	lab.setFont(fnt);
	lab.setText("Dialog");
	}
	else if(selct=="Monspaced")
	{
	Font fnt=new Font("Monspaced",Font.ITALIC+Font.BOLD,16);
	lab.setFont(fnt);
	lab.setText("Monspaced");
	}
	else if(selct=="SansSerif")
	{
	Font fnt=new Font("SansSerif",Font.ITALIC+Font.BOLD,16);
	lab.setFont(fnt);
	lab.setText("SansSerif");

	
	}
	else if(selct=="Serif")
    {
	Font fnt=new Font("Serif",Font.ITALIC+Font.BOLD,16);
	lab.setFont(fnt);
	lab.setText("Serif");
	}
    else if(selct=="DialogInput")
	{
	Font fnt=new Font("DialogInput",Font.ITALIC+Font.BOLD,16);
	lab.setFont(fnt);
	lab.setText("DialogInput");
	}
	}
	}