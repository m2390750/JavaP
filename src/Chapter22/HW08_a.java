package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class HW08_a extends Frame implements ActionListener{
	
	static HW08_a frm=new HW08_a();
	static Button btn=new Button("�s�u");
	static TextArea txa=new TextArea("",8,14,TextArea.SCROLLBARS_NONE);
	
	static public void main(String args[])
	{
		BorderLayout br=new BorderLayout(2,2);
		frm.setLayout(br);
		frm.setSize(200,200);
		frm.setTitle("Server");
		btn.addActionListener(frm);
		
		txa.setEditable(false);
		frm.add(btn,br.SOUTH);
		frm.add(txa,br.CENTER);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		txa.setText("");
		Button mybtn=(Button)e.getSource();
		if(mybtn==btn)
		{
			try {
				
			ServerSocket svs=new ServerSocket(2525);
			txa.append("���ԫȤ�ݪ��ШD��..."+"\n");
			
			Socket s=svs.accept();
			txa.append("�Ȥ�ݤw�M�����s�W�u..."+"\n");
			txa.append("��ƥ��b�ǰe��..."+"\n");
			OutputStream out=s.getOutputStream();
			String str="Honor shows the man.";
			out.write(str.getBytes());
			
			
			txa.append("��ƶǰe����..."+"\n");
			
			InputStream in=s.getInputStream();
			byte buff[]=new byte[1024];
			int n=in.read(buff);
			txa.append("�q�Ȥ�ݦ���: ");
			String rec_str=new String(buff,0,n);
			txa.append(rec_str+"\n");
			if(rec_str.equals("Received"))
				txa.append("Transfer completed"+"\n");
			out.close();
			in.close();
			s.close();
		}
		catch(Exception ee)
		{
			System.out.println("�o�ͤF"+ee+"�ҥ~");
		}
		btn.setEnabled(false);
		}
	}
}
