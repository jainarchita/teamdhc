import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Tanmay
   @version 5

   @author  1
   @author  Assignment - Ch37_AppletEx

   @author  Sources - TODO list collaborators
 */
public class HolidayCard extends JApplet
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
            String str = "Merry Christmas!";

            Font curFont = applet.getFont();
            FontMetrics curFontMetrics = applet.getFontMetrics( curFont );
            Rectangle2D r2d = curFontMetrics.getStringBounds( str, gr );

            int strWidth = (int)( (Rectangle2D.Float)r2d ).width;
            int strHeight = (int)( (Rectangle2D.Float)r2d ).height;
            gr.setColor( Color.BLACK );
            height/= 2;
            gr.drawString( str, ( width - strWidth ) / 2, ( height + strHeight ) / 2 );
            height*=2;

            int size = (height + width)/40;
            
            Circle circ = new Circle(width/2,(height)/2,size); 
            int ch=height/2;
            int cw = width/2;
            circ.draw(gr);
            
            
            circ.drawc(cw - size,ch - size,size/2,gr);
            circ.drawc(cw + size,ch - size,size/2,gr);
            circ.drawc( cw - size/3, ch - size/4, size/6, gr );
            circ.drawc( cw + size/3, ch - size/4, size/6, gr );
            circ.drawc( cw, ch, size/6, gr );
            circ.drawc( cw, ch + size/2, size/6, gr );
            
            ///WORLD DIMENSIONS CHANGED
            ch+= 3*size;
            size*=2; 
            
            circ.drawc(cw,ch, size, gr );
            circ.drawc(cw - 3* size/4,ch - 5*size/8,size/4,gr); gr.setColor( Color.white ); circ.fill( gr ); gr.setColor( Color.BLACK );
            circ.drawc(cw + 3* size/4,ch - 5*size/8,size/4,gr); gr.setColor( Color.white ); circ.fill( gr ); gr.setColor( Color.BLACK );
            circ.drawc(cw - 3* size/4,ch + 5*size/8,size/4,gr); gr.setColor( Color.white ); circ.fill( gr ); gr.setColor( Color.BLACK );
            circ.drawc(cw + 3* size/4,ch + 5*size/8,size/4,gr); gr.setColor( Color.white ); circ.fill( gr ); gr.setColor( Color.BLACK );
           
            
            
            
            // TODO your code
        }
    }
}
