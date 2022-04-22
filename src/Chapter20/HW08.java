package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW08 extends Frame implements AdjustmentListener{
	static HW08 frm=new HW08();
	static Scrollbar scr1=new Scrollbar(Scrollbar.VERTICAL);//紅色
	static Scrollbar scr2=new Scrollbar(Scrollbar.HORIZONTAL);//綠色
	static Scrollbar scr3=new Scrollbar(Scrollbar.VERTICAL);//藍色
	static Label lab=new Label();
	public static void main(String args[])
	{
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		BorderLayout br=new BorderLayout(5,5);
		frm.setTitle("Display colors");
		frm.setSize(200,150);
		frm.add(scr1,br.WEST);
		frm.add(scr2,br.SOUTH);
		frm.add(scr3,br.EAST);
		
		frm.add(lab,br.NORTH);

		scr1.setValues(255, 45, 0, 300);
		scr2.setValues(255, 45, 0, 300);
		scr3.setValues(255, 45, 0, 300);
		
		scr1.addAdjustmentListener(frm);
		scr2.addAdjustmentListener(frm);
		scr3.addAdjustmentListener(frm);
		
		frm.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		Graphics g=getGraphics();
		paint(g);
	}
	public void paint(Graphics g)
	{
		int red   =scr1.getValue();
		int green =scr2.getValue();
		int blue  =scr3.getValue();
		
		String str="Color("+red+","+green+","+blue+")";
		
		g.setColor(new Color(red,green,blue));//設定繪圖顏色
		lab.setText(str);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.pink);
//		g.drawString(str, 45, 80);
	}
}
