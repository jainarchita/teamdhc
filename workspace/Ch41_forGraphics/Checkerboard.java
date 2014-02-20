import java.awt.*;


/**
 * This applet draws a red-and-black checkerboard. It is assumed that the size
 * of the applet is 160 by 160 pixels.
 * 
 * @author TODO your name
 * @version TODO date
 * @author Period - TODO Your Period
 * @author Assignment - Ch41_forGraphics
 * @author Sources - TODO list collaborators
 */
public class Checkerboard extends AnimationBase
{
    public void drawFrame( Graphics g )
    {
        int width = getWidth();
        int height = getHeight();
        boolean flag = false;
        int length;
        if ( width < height )
        {
            length = width / 8;
        }
        else
        {
            length = height / 8;
        }

        setBackground( Color.red );

        int x = 0;
        int y = 0;

        g.setColor( Color.black );
        for ( int i = 1; i <= 8; i++ )
        {
           
            for ( int j = 1; j <= 8; j++ )
            {
                x = (j - 1) * length;
                y= (i - 1) *length;
                if ( i % 2 == j % 2 )
                {
                    g.fillRect( x, y, length, length );

                }
                

            }
            
        }
    }
}
