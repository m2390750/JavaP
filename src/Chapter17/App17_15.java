package Chapter17;
import java.awt.*;

public class App17_15 {
	static Frame frm=new Frame("Card Layout");
	public static void main(String args[])
	{	
		CardLayout card=new CardLayout(550,10);
		
		frm.setLayout(card);
		frm.setSize(150,200);
		
		frm.add(new Button("Button 1"),"c1");
		frm.add(new Button("Button 2"),"c2");
		frm.add(new Button("Button 3"),"c3");
		card.show(frm,"c2");
		frm.setVisible(true);
	}
}
