package Chapter17;
import java.awt.*;
import java.awt.event.*;
public class App17_2
{
		public static void main(String args[])
		{	
		Frame frm=new Frame("my first AWT program");			
		Label lab=new Label("Hello Java!!");
		
		frm.setTitle("my first AWT program");
		frm.setSize(220, 150);//設定視窗的大小
		frm.setBackground(Color.yellow);//設定視窗背景的顏色
		frm.setLocation(1000,500);//執行程式後 視窗出現的位子
		frm.add(lab);//將物件加入視窗
		frm.setVisible(true);
		}
}