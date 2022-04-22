package Chapter22;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class HW06 extends Frame implements ActionListener,TextListener {
	
	static HW06 frm=new HW06();
	
	static TextArea txa1=new TextArea();//查詢網址
	static TextArea txa2=new TextArea();//顯示查詢結果
	static Button btn1=new Button("查詢");
	String str;
	
	public static void main(String arsg[])
	{	frm.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e) {System.exit(0);}});
		BorderLayout br=new BorderLayout();
		frm.setSize(400,400);
		frm.setLayout(br);
		
		
		btn1.addActionListener(frm);
		txa2.setEditable(false);
		
		frm.add(btn1,br.SOUTH);frm.add(txa1,br.NORTH);frm.add(txa2,br.CENTER);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		
		str=txa1.getText();
		System.out.println(str);
		try
			{
			URL u=new URL(str);
			URLConnection uc=u.openConnection();
			txa2.append("大小為"+uc.getContentLength()+"\n");
			txa2.append("類型為"+uc.getContentType()+"\n");
			
//			InetAddress adr;
//			adr=InetAddress.getByName(str);
//			txa2.append(adr.toString());
			
			}
		catch(UnknownHostException f)
		{System.out.println("無法取得IP位址");}
		catch(IOException h)
		{}
	}





	@Override
	public void textValueChanged(TextEvent e) {
		
	}





	
}
