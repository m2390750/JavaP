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
		frm.setSize(220, 150);//�]�w�������j�p
		frm.setBackground(Color.yellow);//�]�w�����I�����C��
		frm.setLocation(1000,500);//����{���� �����X�{����l
		frm.add(lab);//�N����[�J����
		frm.setVisible(true);
		}
}