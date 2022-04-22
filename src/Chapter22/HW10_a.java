package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class HW10_a extends Frame implements ActionListener{
	static HW10_a frm=new HW10_a();
	static Button btn=new Button("�s�u");
	static TextArea txa=new TextArea("",8,14,TextArea.SCROLLBARS_NONE);
	static public void main(String args[])
	{
		BorderLayout br=new BorderLayout(2,2);
		frm.setLayout(br);
		frm.setSize(200,180);
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
		byte buff[]=new byte[1024];
		if(mybtn==btn)
		{
			try
			{
				ServerSocket svs=new ServerSocket(2525);
				txa.append("���ԫȤ�ݪ��ШD��..."+"\n");
				
				Socket s=svs.accept();
				txa.append("�Ȥ�ݩM�����s�W�u..."+"\n");
				InputStream in=s.getInputStream();
				int n=in.read(buff);
				
				txa.append("�q�Ȥ�ݦ���: ");
				
				String rec_str=new String(buff,0,n);
				
				txa.append("�Ǧ^"+rec_str+"��Ȥ��"+"\n");
				OutputStream out = s.getOutputStream();
				out.write(rec_str.getBytes());
				in.close();		
				out.close();
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
