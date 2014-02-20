import javax.swing.*;

import java.awt.*;

/**
   Graphs and animates the sine function in red and the cosine function
   in blue, both in the same drawing area. Draws the x and y axis. Also,
   draws "tick" marks along the x axis at PI/4, PI/2, 3*PI/4, and 2*PI.
   Draw axes and tick marks in black.
   
   The drawing area is 600 by 400. (X=0, Y=0) is the top left corner.

   @author  Tanmay Chordia
   @version TODO date

   @author  Period - TODO Your Period
   @author  Assignment - Ex4_SinCosWaveAnim

   @author  Sources - TODO list collaborators
 */
public class Ex4_SinCosWaveAnim extends AnimationBase
{
    public void init()
    {
        setBackground( Color.WHITE );
        this.setMillisecondsPerFrame( 30 );
        // add additional initialization code if necessary
    }

    public void drawFrame( Graphics gr )
    {
        double inc = 1.0/32.0;
        int width = getWidth();
        int height = getHeight();
        
     
        gr.setColor( Color.white );
        gr.fillRect( 0, 0, width, height );
        
       
       
        for (double x = -6 * Math.PI; x <= 2*Math.PI; x = x + inc)
        {
          double y     = Math.sin(x);
          double nextx = x + inc;
          double nexty = Math.sin(nextx);
          
       
          /* 
           * draw axis
           */
          gr.setColor(Color.black);
         
          gr.drawLine(width/2, 0 , width/2, height);
          gr.drawLine(0, height/2 , width, height/2);
          
          gr.setColor( Color.blue );
          for (int i=1; i<8; i++)
          {
              gr.drawLine( i * width/8, height/2 -5, i *width/8, height/2 + 5 );
             
          }
          
          int startX = (int)( x * width/(2*Math.PI)) + 3* (getFrameNumber() % width);
          int startY = (int)(-y * height/2.0 + height/2.0);
          int endX   = (int)( nextx * width/(2*Math.PI)) + 3 * (getFrameNumber() % width);
          int endY   = (int)(-nexty * height/2.0 + height/2.0);
          
          
          gr.drawLine(startX, startY, endX, endY);
        }
        
        gr.setColor( Color.red );
        for (double x = -6*Math.PI; x <= 2*Math.PI; x = x + inc)
        {
          double y     = Math.cos(x);
          double nextx = x + inc;
          double nexty = Math.cos(nextx);
          width = getWidth();
          height = getHeight();
          
          gr.setColor(Color.black);
          /* 
           * draw axis
           */
          
          gr.drawLine(width/2, 0 , width/2, height);
          gr.drawLine(0, height/2 , width, height/2);
         
          for (int i=1; i<8; i++)
          {
              gr.drawLine( i * width/8, height/2 -5, i *width/8, height/2 + 5 );
             
          }
          gr.setColor( Color.red );
          int startX = (int)( x * width/(2*Math.PI)) + 3* (getFrameNumber() % width);
          int startY = (int)(-y * height/2.0 + height/2.0);
          int endX   = (int)( nextx * width/(2*Math.PI)) + 3 * (getFrameNumber()% width);
          int endY   = (int)(-nexty * height/2.0 + height/2.0);
          
          
          gr.drawLine(startX, startY, endX, endY);
        }
    }
}