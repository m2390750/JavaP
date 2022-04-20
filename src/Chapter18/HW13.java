package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class HW13 extends Frame implements TextListener,ActionListener{
		
	static HW13 frm=new HW13();
	static Button btn1=new Button("Yellow");
	static Button btn2=new Button("Green");
	static TextArea txa=new TextArea();
	
	public static void main(String args[])
	{
	
		
		frm.setTitle("Action Event");
		frm.setSize(200,200);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		txa.addTextListener(frm);
		frm.add(txa);
		frm.add(btn1);
		frm.add(btn2);
		
		frm.setVisible(true);
	}
	public void textValueChanged(TextEvent e)
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Button btn=(Button) e.getSource();
		
		if(btn==btn1)
		{txa.setBackground(Color.yellow);}
		else if(btn==btn2)
		{txa.setBackground(Color.green);}
	}

}
