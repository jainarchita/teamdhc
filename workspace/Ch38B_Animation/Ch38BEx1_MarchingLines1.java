import javax.swing.*;

import java.awt.*;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO your name
 * @version TODO date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch38BEx1_MarchingLines1
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch38BEx1_MarchingLines1 extends AnimationBase
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
       //super.drawFrame( g ); // remove this line
        int a = 0;
        int width = getWidth();

        int height = getHeight();
        int frame = getFrameNumber();
        a += frame % 15;
        g.setColor( Color.white );
        g.fillRect(0,0,width, height);
        g.setColor( Color.black );
        for ( int i = a; i <= width; i += 15 )
        {

            g.drawLine( i, 0, i, height );
        }

    }
}
