package Chapter18;
import java.awt.*;
import java.awt.event.*;

public class HW21 extends Frame implements ActionListener,TextListener 
{
	
	static HW21 frm= new HW21();
	static Button btn1=new Button("Show");
	static Button btn2=new Button("Hide");
	static TextArea txa=new TextArea();
	static WinLis wlis=new WinLis();
	public static void main(String args[])
	{
		txa=new TextArea("",4,18,TextArea.SCROLLBARS_BOTH);
		txa.setSize(100, 100);
		frm.setSize(200, 200);
		frm.setTitle("Frame Title");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		frm.addWindowListener(wlis);
		
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		txa.addTextListener(frm);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(txa);
		
		frm.setVisible(true);
	}

	static class WinLis extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("����������");
			frm.dispose();
			System.out.println("�����w����");
		}
		
		public void windowClosed(WindowEvent e)
		{
			txa.append("�����w����"+"\n");
		}
		
		public void windowDeactivated(WindowEvent e)
		{
			txa.append("�ثe���D�@�Τ�����"+"\n");
		}
		
		public void windowActivated(WindowEvent e)
		{
			txa.append("�ثe���@�Τ�����"+"\n");
		}
		
		public void windowDeiconified(WindowEvent e)
		{
			txa.append("�w�٭쬰�@�����"+"\n");
		}
		
		public void windowIconified(WindowEvent e)
		{
			txa.append("�����̤p��"+"\n");
		}
		
		public void windowOpened(WindowEvent e)
		{
			txa.append("�����w�}��"+"\n");
		}
	}
	public void textValueChanged(TextEvent e)
	{
		txa.getText();
	}
	public void actionPerformed(ActionEvent e)
	{
		Button btn=(Button) e.getSource();
		if(btn==btn1)
			txa.setVisible(true);
		else if(btn==btn2)
			txa.setVisible(false);
	}
}
