package Chapter17;
import java.awt.*;
import java.awt.event.*;
public class App17_3 extends Frame
{
		public static void main(String args[])
		{	
			App17_3 frm=new App17_3();
			
//			frm.addWindowListener(new WindowAdapter()
//			{public void windowClosing(WindowEvent e) {System.exit(0);}});			
//		
		Label lab=new Label("Hello Java!!");
		
		frm.setTitle("my first AWT program");
		frm.setSize(220, 150);//設定視窗的大小
		frm.setBackground(Color.yellow);//設定視窗背景的顏色
		frm.setLocation(1000,500);//執行程式後 視窗出現的位子
		frm.add(lab);//將物件加入視窗
		frm.setVisible(true);
		}
}