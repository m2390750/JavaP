package Chapter17;
import java.awt.*;
public class HW21 {
	public static void main(String args[])
	{
		GridLayout grid = new GridLayout(2,3);
		Frame frm=new Frame("Grid Layout");
		
		frm.setLayout(grid);
		frm.setSize(250,150);
		
		for(char i=65;i<=70;i++)
			frm.add(new TextField("("+Character.toString(i)+")"));
		
		frm.setVisible(true);
	}
}
