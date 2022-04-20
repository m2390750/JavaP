package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW14 extends Frame implements ActionListener,TextListener 
{
	
	static HW14 frm= new HW14();
	static Button btn1=new Button("Show");
	static Button btn2=new Button("Hide");
	static TextArea txa=new TextArea();
	public static void main(String args[])
	{
		frm.setSize(200, 200);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setTitle("Frame Title");
		
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		txa.addTextListener(frm);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(txa);
		
		frm.setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn=(Button)e.getSource();
		if(btn==btn1)
		{txa.show();}
		else if(btn==btn2)
		{txa.hide();}
	}
}
