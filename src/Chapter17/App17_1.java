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
		
		frm.setSize(220, 150);//�]�w�������j�p
		frm.setBackground(Color.yellow);//�]�w�����I�����C��
		frm.setLocation(1000,500);//����{���� �����X�{����l
		frm.add(lab);//�N����[�J����
		frm.setVisible(true);
	}
}
