package Chapter20;
import java.awt.*;
import java.awt.event.*;
public class HW19_01 extends Frame implements
MouseMotionListener,MouseListener

{
static HW19_01 frm=new HW19_01();
int x1,x2,y1,y2;
boolean pressed=false;
boolean dragged=false;
Point start;
public static void main(String args[])
{
frm.setTitle("Line drawing");
frm.setSize(200,150);
frm.addMouseListener(frm);
frm.addMouseMotionListener(frm);
frm.setVisible(true);
}
public void mousePressed(MouseEvent e)
{
pressed=true;
start=e.getPoint();
}
public void mouseDragged(MouseEvent e)
{
Graphics g=getGraphics();
if(pressed && !dragged)
{
g.setColor(Color.blue);
x2=e.getX();
y2=e.getY();

g.drawLine(start.x,start.y,x2,y2);
x1=x2;
y1=y2;
}
dragged=true;
if(pressed && dragged)
{
g.setColor(getBackground());
g.drawLine(start.x,start.y,x1,y1);
g.setColor(Color.blue);
x2=e.getX();
y2=e.getY();
g.drawLine(start.x,start.y,x2,y2);
x1=x2;
y1=y2;
}
}
public void mouseMoved(MouseEvent e){}
public void mouseClicked(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mouseReleased(MouseEvent e){}
}