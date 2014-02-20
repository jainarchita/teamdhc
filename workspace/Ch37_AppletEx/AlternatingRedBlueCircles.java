import javax.swing.*;

import java.awt.*;
import java.awt.geom.Rectangle2D;
/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO your name
   @version TODO date

   @author  Period - TODO Your Period
   @author  Assignment - Ch37_AppletEx

   @author  Sources - TODO list collaborators
 */
public class AlternatingRedBlueCircles extends JApplet
{
    /**
     * The applet's init() method creates the display panel and adds them
     * to the applet.
     */
    public void init()
    {
        Display displayPanel = new Display();

        JPanel content = new JPanel();
        content.setLayout( new BorderLayout() );
        content.add( displayPanel, BorderLayout.CENTER );
        setContentPane( content );
    }

    // Defines the display panel.
    public class Display extends JPanel
    {
        public void paintComponent( Graphics gr )
        {
            super.paintComponent( gr );

            Container applet = getContentPane();
            int width = applet.getWidth();
            int height = applet.getHeight();
            setBackground(Color.WHITE);

            gr.setColor( Color.BLUE );
            gr.drawRect( 0, 0, width - 1, height - 1 );
            String str = "TODO: complete this exercise";

            Font curFont = applet.getFont();
            FontMetrics curFontMetrics = applet.getFontMetrics( curFont );
            Rectangle2D r2d = curFontMetrics.getStringBounds( str, gr );

            int strWidth = (int)( (Rectangle2D.Float)r2d ).width;
            int strHeight = (int)( (Rectangle2D.Float)r2d ).height;
            gr.setColor( Color.BLACK );
           // gr.drawString( str, ( width - strWidth ) / 2, ( height + strHeight ) / 2 );
            
            gr.setColor( Color.red );
            Circle circ = new Circle(width/11,(height)/2,width/40); 
            for (int i=1;i<=5;i++)
            {
            //circ.draw(gr);
            circ.drawc((width * i)/6 - width/24,(height/2),width/40,gr);
            }
            gr.setColor( Color.blue );
            for (int i=1;i<=5;i++)
            {
            int swid = (width * (2 * i + 1) / 12);
            gr.drawRect(swid - width/40 - width/24,height/2 - width/40,width/20, width/20);
            }
            
            // TODO your code
        }
    }
}
