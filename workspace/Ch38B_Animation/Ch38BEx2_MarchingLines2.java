import javax.swing.*;

import java.awt.*;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author Tanmay Chordia
 * @version January 16, 2014
 * 
 * @author Period - 1
 * @author Assignment - Ch38BEx2_MarchingLines2
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch38BEx2_MarchingLines2 extends AnimationBase
{
    /**
     * This routine is called by the system when the applet is first created.
     */
    public void init()
    {
        // add initialization code if necessary
    }


    /**
     * This routine is called by the animation framework every time a new frame
     * needs to be drawn.
     * 
     * For this animation, TODO complete comment
     */
    public void drawFrame( Graphics g )
    {
        
        int width = getWidth();

        int height = getHeight();
        int frame = getFrameNumber();
        int a = frame % 15;
        g.setColor( Color.white );
        g.fillRect( 0, 0, width, height );
        g.setColor( Color.blue);
        for ( int i = a; i <= width; i += 15 )
        {

            g.drawLine( i, 0, i, height );
        }

       
        
        a = frame % 15 + height/4;
        g.setColor( Color.blue );
        g.fillRect( width / 4, height / 4, 2 * (width / 4), (height / 4) * 2 );
        g.setColor( Color.white );
        for ( int i = a; i <= (height * 3)/4; i += 15 )
        {

            g.drawLine( width/4, i, 3 * width/4, i );
        }
        // TODO complete method
    }
}
