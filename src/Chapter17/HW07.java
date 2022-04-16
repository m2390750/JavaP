package Chapter17;
import java.awt.*;
public class HW07 {
	
	static Frame frm=new Frame("My Label Frame");
	public static void main(String args[])
	{
		frm.setSize(350, 120);
		frm.setLayout(null);
		frm.setBackground(Color.gray);
		Label lab=new Label("Seeing is believing.");
		lab.setSize(220,25);
		lab.setLocation(100,50);
		lab.setBackground(Color.YELLOW);
		lab.setForeground(Color.red);
		lab.setAlignment(Label.RIGHT);
		
		Font fnt=new Font("Courier New",Font.BOLD,20);
		 
		lab.setFont(fnt);
		frm.add(lab);
		frm.setVisible(true);
	}

}
