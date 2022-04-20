package Chapter18;
import java.awt.*;
import java.awt.event.*;
public class App18_6 extends Frame implements TextListener,ActionListener
{
	static App18_6 frm=new App18_6();
	static TextArea txa1;
	static TextArea txa2;
	static Button btn3=new Button("Exit");
	
	public static void main(String args[])
	{
		txa1=new TextArea("a",6,10,TextArea.SCROLLBARS_NONE);
		txa2=new TextArea("A",6,10,TextArea.SCROLLBARS_NONE);
		
		frm.setSize(200,150);
		frm.setTitle("Text Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		txa1.addTextListener(frm);
		txa2.setEditable(false);
		
		frm.add(txa1);
		frm.add(txa2);
		
		btn3.addActionListener(frm);
		frm.add(btn3);
		
		frm.setVisible(true);
	}
	
	public void textValueChanged(TextEvent e)
	{
		txa2.setText(txa1.getText());
	}
	public void actionPerformed(ActionEvent e)
	{	
		System.exit(0);	
	}
}
