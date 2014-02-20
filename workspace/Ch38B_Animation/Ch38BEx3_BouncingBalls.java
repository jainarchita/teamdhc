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
 * @author Assignment - Ch38BEx3_BouncingBalls
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch38BEx3_BouncingBalls extends AnimationBase
{
    /**
     * This routine is called by the system when the applet is first created.
     */
    BouncingBall red;

    BouncingBall blue;

    BouncingBall green;

    BouncingBall orange;

    BouncingBall yellow;


    public void init()
    {
        red = new BouncingBall( getWidth() / 2, getHeight() / 2, 5, Color.red );
        blue = new BouncingBall( getWidth() / 2,
            getHeight() / 2,
            10,
            Color.blue );
        green = new BouncingBall( getWidth() / 2,
            getHeight() / 2,
            15,
            Color.green );
        orange = new BouncingBall( getWidth() / 2,
            getHeight() / 2,
            20,
            Color.orange );
        yellow = new BouncingBall( getWidth() / 2,
            getHeight() / 2,
            25,
            Color.yellow );
        
        
        
    }


    /**
     * This routine is called by the animation framework every time a new frame
     * needs to be drawn.
     * 
     * For this animation, TODO complete comment
     */
    public void drawFrame( Graphics g )
    {
        // drawFrame( g ); // remove this line
        int width = getWidth();
        int height = getHeight();
        g.setColor( Color.black );
        g.fillRect( 0, 0, width, height ); // change back to 00
        
        //g.setColor( Color.white );
        //Circle circ = new Circle (getWidth()/2, getHeight()/2, 10, Color.white);
        //circ.drawFilled( g );
        red.doFrame( g, width, height );

        blue.doFrame( g, getWidth(), getHeight() );

        green.doFrame( g, getWidth(), getHeight() );

        orange.doFrame( g, getWidth(), getHeight() );

        yellow.doFrame( g, getWidth(), getHeight() );
        

        

    }
}
