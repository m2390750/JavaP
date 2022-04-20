package Chapter19;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class App19_9 extends Frame implements ActionListener{
	
	static App19_9 frm=new App19_9();
	static FileDialog fdlg = new FileDialog(frm,"open");
	static Button btn=new Button("open");
	static TextArea txa=new TextArea();
	
	public static void main(String args[])
	{
		BorderLayout br=new BorderLayout();
		frm.setTitle("Dialog Demo");
		frm.setLayout(br);
		frm.setSize(200,150);
		frm.add(txa,br.CENTER);
		frm.add(btn,br.SOUTH);
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		btn.addActionListener(frm);
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
			txa.setText(new String(ba));
			fi.close();			
		}
		catch(IOException ioe) {};
	}
}
