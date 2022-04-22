package Chapter19;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class HW16 extends Frame implements ActionListener,TextListener{
	
	static HW16 frm=new HW16();
	static FileDialog fdlg = new FileDialog(frm,"Open");
	static FileDialog save_fdlg=new FileDialog(frm,"Save",FileDialog.SAVE);
	static Dialog dlg=new Dialog(frm);
	static Button btn=new Button("Open File");
	static TextArea txa1=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa2=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa3=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static short count=0;
	static String fname;
	
	public static void main(String args[])
	{	
		frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){frm.dispose();}});
		dlg.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){dlg.dispose();}});
		frm.setTitle("File Dialog");
		frm.setLayout(null);
		frm.setSize(250,160);
		
		txa1.setBounds(10,35,230,40);txa2.setBounds(10,80,230,40);
		btn.setBounds(85,125,80,20);
		txa1.setBackground(Color.yellow);txa2.setBackground(Color.orange);
		dlg.setTitle("Show Data");
		dlg.setSize(250,100);
		dlg.setLayout(null);
		
		txa3.setBounds(10,30,230,60);
		txa3.setEditable(false);
		dlg.add(txa3);
		
		frm.add(txa1);frm.add(txa2);frm.add(btn);
		txa1.addTextListener(frm);txa2.addTextListener(frm);btn.addActionListener(frm);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		Button c_btn=(Button)e.getSource();
	if(c_btn.getLabel()=="Open File")		
		{
			fdlg.setVisible(true);
			fname=fdlg.getDirectory()+fdlg.getFile();		
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
	else if(c_btn.getLabel()=="Merge")
		{
			save_fdlg.setVisible(true);
			fname=save_fdlg.getDirectory()+save_fdlg.getFile();
			try
			{
				FileOutputStream fo=new FileOutputStream(fname);
				String str=txa1.getText()+txa2.getText();
				txa3.setText(str);
				byte data[]=str.getBytes();
				fo.write(data);
				fo.close();
				btn.setLabel("Show");
			}
			catch(IOException ioe) {};
		}
	}
	public void textValueChanged(TextEvent e) {}
}
