package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class HW07_a extends Frame implements ActionListener{
	
	static HW07_a frm=new HW07_a();
	static Button btn=new Button("連線");
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
			txa.append("等候客戶端的請求中..."+"\n");
			
			Socket s=svs.accept();
			txa.append("客戶端已和本機連上線..."+"\n");
			txa.append("資料正在傳送中..."+"\n");
			OutputStream out=s.getOutputStream();
			String str="Honor shows the man.";
			out.write(str.getBytes());
			out.close();
			s.close();
			txa.append("資料傳送完畢..."+"\n");
		}
		catch(Exception ee)
		{
			System.out.println("發生了"+ee+"例外");
		}
		btn.setEnabled(false);
		}
	}
}
