package Chapter22;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class HW04_05 extends Frame implements ActionListener,TextListener{
	static HW04_05 frm=new HW04_05();
	static TextArea ta=new TextArea();
	static Button btn=new Button();
	String str,str1="";
	public static void main(String args[])
	{
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {System.exit(0);}});
		BorderLayout br=new BorderLayout();
		frm.setSize(400,400);
		frm.setLayout(br);
		btn.addActionListener(frm);
		
		frm.add(btn,br.SOUTH);
		frm.add(ta,br.NORTH);
		frm.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		try 
		{
			URL u=new URL("file:/C:\\java\\train.txt");
			
			Object obj=u.getContent();
			InputStreamReader isr=new InputStreamReader((InputStream)obj);
			
			BufferedReader br=new BufferedReader(isr);
			
			while((str=br.readLine())!=null)
				ta.append(str+"\n");
			br.close();
		}
		catch(IOException f)
		{
			System.out.println("發生了例外"+e);
		}
	}
	public void textValueChanged(TextEvent e)
	{
		
	}
	
}
