package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class HW10_b extends Frame implements ActionListener,TextListener
{
	static HW10_b frm=new HW10_b();
	static Button btn=new Button("�s�u+�ǰe");
	static TextField txf=new TextField("�п�J���ǰe�����");
	static TextArea txa=new TextArea("",8,14,TextArea.SCROLLBARS_NONE);
	static public void main(String args[])
		{
		BorderLayout br=new BorderLayout(2,2);
		frm.setLayout(br);
		frm.setSize(200,180);
		frm.setTitle("Client");
		btn.addActionListener(frm);
		txf.addActionListener(frm);
		txa.setEditable(false);
		frm.add(btn,br.SOUTH);
		frm.add(txa,br.CENTER);
		frm.add(txf,br.NORTH);
		frm.setVisible(true);
		}
	public void actionPerformed(ActionEvent e)

	{
	txa.setText("");
	Button mybtn=(Button) e.getSource();
	byte buff[]=new byte[1024];
	if(mybtn==btn)
		{
		try
		{
			txa.append("���b�P���A���إ߳s�u..."+"\n");
			Socket s=new Socket("127.0.0.1",2525);
			txa.append("�w�g�P���A�����o�s�u..."+"\n");
			OutputStream out=s.getOutputStream();
			String send_str=txf.getText();
			txa.append("�ǰe"+send_str+"����A��..."+"\n");
			out.write(send_str.getBytes());
			txf.setEditable(false);
			InputStream in=s.getInputStream();
			int n=in.read(buff);
			txa.append("�q���A�ݦ���: ");
			String str=new String(buff,0,n);
			txa.append(str+"\n");
			
//			in.close();		
//			out.close();
//			s.close();	
		
		}
		catch(Exception ee)
		{
			System.out.println("�o�ͤF"+ee+"�ҥ~");
		}
		btn.setEnabled(false);

	}
}
public void textValueChanged(TextEvent e)
{
}
}