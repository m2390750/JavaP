package Chapter18;

import java.awt.*;
import java.awt.event.*;
 
public class Practice1 {
    Frame frame;
    Label label1, label2, label3;
     
    public static void main(String[] args) {
        new Practice1();
    }
     
    public Practice1() {
        frame = new Frame("AWTDemo");
//        frame.addWindowListener(new AdapterDemo());
        frame.setLayout(new GridLayout(3, 1));
        frame.setSize(400, 180);
         
        label1 = new Label();
        label1.setAlignment(Label.LEFT);
        label1.setText("There is no spoon.");
        label2 = new Label();
        label2.setAlignment(Label.RIGHT);
        label2.setText("There is no spoon.");
        label3 = new Label();
        label3.setAlignment(Label.CENTER);
        label3.setText("There is no spoon.");
         
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setVisible(true);
         
        System.out.println("1 alignment: " + label1.getAlignment());
        System.out.println("1 text: " + label1.getText());
        System.out.println("2 alignment: " + label2.getAlignment());
        System.out.println("2 text: " + label2.getText());
        System.out.println("3 alignment: " + label3.getAlignment());
        System.out.println("3 text: " + label3.getText());
    }
}
 