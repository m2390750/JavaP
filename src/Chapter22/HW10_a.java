package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class HW10_a extends Frame implements ActionListener{
	static HW10_a frm=new HW10_a();
	static Button btn=new Button("連線");
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
				txa.append("等候客戶端的請求中..."+"\n");
				
				Socket s=svs.accept();
				txa.append("客戶端和本機連上線..."+"\n");
				InputStream in=s.getInputStream();
				int n=in.read(buff);
				
				txa.append("從客戶端收到: ");
				
				String rec_str=new String(buff,0,n);
				
				txa.append("傳回"+rec_str+"到客戶端"+"\n");
				OutputStream out = s.getOutputStream();
				out.write(rec_str.getBytes());
				in.close();		
				out.close();
				s.close();		
			}
			catch(Exception ee)
			{
				System.out.println("發生了"+ee+"例外");
			}
			btn.setEnabled(false);
		}
	}
}
