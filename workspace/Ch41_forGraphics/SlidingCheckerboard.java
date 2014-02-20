import java.awt.*;

/**
   Applet shows a checkerboard pattern in which the even numbered
   rows slide to the left and the odd numbered rows slide to the
   right.  It is ASSUMED that the applet is 160x160 pixels, since
   the individual squares in the board are 20 pixels on a side.
      
   @author  Tanmay Chordia
   @version TODO date

   @author  Period - TODO Your Period
   @author  Assignment - Ch41_forGraphics

   @author  Sources - TODO list collaborators
 */
public class SlidingCheckerboard extends AnimationBase
{
    public void drawFrame( Graphics g )
    {

        int width = getWidth();
        int height = getHeight();

        int length;
        if ( width < height )
        {
            length = width / 8;
        }
        else
        {
            length = height / 8;
        }

        setBackground( Color.white );

        int x = -length;
        int y = -length;

        g.setColor( Color.black );
        for ( int i = 1; i <= 9; i++ )
        {
            
            int num = getFrameNumber() % (2 *length );
            if ((length < num))
            {
                num = -num;
            }
            for ( int j = -1; j <= 11; j++ )
            {
                x = ((j - 2) * length); 
                y = ((i - 2) *length);
                if (i % 2 == 0)
                {
                    x += num;
                }
                else
                    x-= num;

                
                if ( i % 2 == j % 2 )
                {
                    g.fillRect( x, y, length, length );

                }
                else
                {
                    g.setColor( Color.red ); 
                    g.fillRect( x, y, length, length );
                    g.setColor( Color.black );
                    
                }

            }
            
        }
    }
}

