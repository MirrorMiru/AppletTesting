import java.awt.*;
import java.applet.*;
public class AppletTest extends Applet
{
     String msg="";
     public void init()
    {
         msg="Hello World ";
     }
 
     public void start()
     {
         msg=msg+",i am an applet";
     }
 
     public void paint(Graphics g)
     {
         g.drawString(msg,20,20);
     }
}