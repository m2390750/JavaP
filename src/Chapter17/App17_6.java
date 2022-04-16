package Chapter17;
import java.awt.*;
public class App17_6 {

	static Frame frm=new Frame("Label class");
	static Label lab=new Label();
	
	public static void main(String args[])
	{
		frm.setSize(200, 150);//設定視窗的大小
		frm.setBackground(Color.black);//設定視窗背景的顏色
		lab.setText("Hello Java");
		lab.setBackground(Color.white);
		lab.setAlignment(Label.CENTER);
		lab.setForeground(Color.blue);
		Font fnt=new Font("Monospaced",Font.ITALIC+Font.BOLD,18);
		lab.setFont(fnt);
		frm.add(lab);
		frm.setVisible(true);
	}
}
