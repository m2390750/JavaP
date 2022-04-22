package Chapter19;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class HW15 extends Frame implements ActionListener,TextListener{
	
	static HW15 frm=new HW15();
	static FileDialog fdlg = new FileDialog(frm,"Open");
	static Button btn=new Button("Open File");
	static TextArea txa1=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa2=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static short count=0;
	
	public static void main(String args[])
	{
		frm.setTitle("File Dialog");
		frm.setLayout(null);
		frm.setSize(250,160);
		
		txa1.setBounds(10,35,230,40);txa2.setBounds(10,80,230,40);
		btn.setBounds(85,125,80,20);
		txa1.setBackground(Color.yellow);txa2.setBackground(Color.orange);
		frm.add(txa1);frm.add(txa2);frm.add(btn);
		txa1.addTextListener(frm);txa2.addTextListener(frm);btn.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		fdlg.setVisible(true);
		
		String fname=fdlg.getDirectory()+fdlg.getFile();
		
		try
		{
			FileInputStream fi=new FileInputStream(fname);
			byte ba[]=new byte[fi.available()];
			fi.read(ba);
			if(count==0)
				txa1.setText(new String(ba));
			else if(count==1)
			{
				txa2.setText(new String(ba));
				btn.setLabel("Merge");
			}
			count++;
			fi.close();
		
		}
		catch(IOException ioe) {};
	}
	public void textValueChanged(TextEvent e) {}
}
