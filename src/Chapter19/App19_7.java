package Chapter19;
import java.awt.*;
import java.awt.event.*;

public class App19_7 extends Frame implements AdjustmentListener{
	static App19_7 frm=new App19_7();
	static Scrollbar scr=new Scrollbar();//建立垂直卷軸scr
	static Label lab1=new Label("Silence is golden.",Label.CENTER);
	static Label lab2=new Label("size=20",Label.CENTER);
	
	public static void main(String args[])
	{
		
		frm.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		BorderLayout br=new BorderLayout(5,5);
		frm.setTitle("Scrollbar Demo");
		frm.setSize(300,150);
		scr.addAdjustmentListener(frm);
		scr.setValues(28,4,12,40);//第一個數字為控制起始位子 第二個為卷軸大小
		frm.add(scr,br.EAST);
		
		frm.add(lab1,br.CENTER);
		frm.add(lab2,br.SOUTH);
		lab1.setFont(new Font("Dialog",Font.PLAIN,20));
		lab2.setBackground(Color.orange);
		frm.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int size=scr.getValue();
		lab1.setFont(new Font("Dialog",Font.PLAIN,size));
		lab2.setText("size="+size);
	}
}
