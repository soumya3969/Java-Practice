import java.applet.*;
import java.awt.*;
public class MyFirstApplet extends Applet{
    public void init(){
        setBackground(Color.YELLOW);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawString("welcome",50 ,75);
        Color c = new Color(0,76,200);
        g.setColor(c);
        Font f =new Font("Times New Roman" ,Font.BOLD, 50);
        g.setFont(f);
        g.drawString("GIFT",100 ,150);
    }
}