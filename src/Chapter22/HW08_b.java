package Chapter22;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class HW08_b extends Frame implements ActionListener
{
static HW08_b frm=new HW08_b();
static Button btn=new Button("�s�u");
static TextArea txa=new TextArea("",8,14,TextArea.SCROLLBARS_NONE);
static public void main(String args[])
 {
 BorderLayout br=new BorderLayout(2,2);
 frm.setLayout(br);
 frm.setSize(200,150);
 frm.setTitle("Client");
 btn.addActionListener(frm);
 txa.setEditable(false);
 frm.add(btn,br.SOUTH);
 frm.add(txa,br.CENTER);
 frm.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
 txa.setText("");
 Button mybtn=(Button) e.getSource();
 if(mybtn==btn)
 {
 byte buff[]=new byte[1024];
 try
 {
 txa.append("���b�P���A���إ߳s�u..."+"\n");
 Socket s=new Socket("127.0.0.1",2525);
 txa.append("�w�g�P���A�����o�s�u..."+"\n");
 InputStream in=s.getInputStream();
 int n=in.read(buff);
 txa.append("�q���A�ݦ���: ");
 String str=new String(buff,0,n);
 txa.append(str+"\n");
 if(str.equals("Honor shows the man."))
 {
  txa.append("�ǻ�Received����A��..."+"\n");
  OutputStream out = s.getOutputStream();
  String send_str="Received";
  out.write(send_str.getBytes());
  out.close();
 }
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