package Chapter17;
import java.awt.*;
public class App17_17 {
	public static void main(String args[])
	{
		GridLayout grid=new GridLayout(10,50);
		Frame frm=new Frame("Grid Layout");
		frm.setLayout(grid);
		frm.setSize(200,150);
		for(int i=1;i<=15;i++)
			frm.add(new Button(Integer.toString(i)));
			
		frm.setVisible(true);
	}
}
