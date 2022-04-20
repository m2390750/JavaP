package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class HW12 extends Frame implements TextListener,ActionListener
{
	static HW12 frm=new HW12();
	static TextArea txa1;
	static TextArea txa2;
	static Button btn3=new Button("Exit");
	static Button btn4=new Button("Clear");
	public static void main(String args[])
	{	
		
		txa1=new TextArea("a",6,10,TextArea.SCROLLBARS_NONE);
		txa2=new TextArea("A",6,10,TextArea.SCROLLBARS_NONE);
		
		frm.setSize(400,400);
		frm.setTitle("Text Event");
		frm.add(txa1);
		frm.add(txa2);
		frm.add(btn3);
		frm.add(btn4);
		frm.setLayout(null);
		txa1.setBounds(80,50,50,50);
		txa2.setBounds(150,50,50,50);
		btn3.setBounds(100,100,90,90);
		btn4.setBounds(200,200,50,50);
		
		txa1.addTextListener(frm);
//		txa2.setEditable(false);
			
		btn3.addActionListener(frm);
		btn4.addActionListener(frm);
				
		frm.setVisible(true);
	}
	
	public void textValueChanged(TextEvent e)
	{
		txa2.setText(txa1.getText());
	}
	public void actionPerformed(ActionEvent e)
	{	
		Button btn= (Button) e.getSource();
		
		if(btn==btn3)
		System.exit(0);	
		else if(btn==btn4)
		{txa1.setText("");txa2.setText("");}
	}
}
