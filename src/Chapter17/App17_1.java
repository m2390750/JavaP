package Chapter17;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class App17_1 {
	static Frame frm=new Frame("my first AWT program");
	static Label lab=new Label("Hello Java!!");
	
	public static void main(String args[])
	{
		frm.addWindowListener((WindowListener) new WindowAdapter()
		{public void windowClosing(WindowEvent e) {System.exit(0);}});
		
		frm.setSize(220, 150);//設定視窗的大小
		frm.setBackground(Color.yellow);//設定視窗背景的顏色
		frm.setLocation(1000,500);//執行程式後 視窗出現的位子
		frm.add(lab);//將物件加入視窗
		frm.setVisible(true);
	}
}
