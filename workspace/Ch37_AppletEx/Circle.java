import javax.swing.JApplet;

import java.awt.*;
import java.util.Random;
/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  5112619
 *  @version Dec 12, 2013
 *  @author  Period: TODO
 *  @author  Assignment: Ch37_AppletEx
 *
 *  @author  Sources: TODO
 */
public class Circle
{
    int x, y, radius;
    /**
     * 
     */
    // constructors
    public Circle()
    { x = 0; y = 0; radius = 0; }

    public Circle( int x, int y, int radius )
    { this.x = x;  this.y = y;  this.radius = radius; }

    public void draw(Graphics gr)
    {
        int ulX = x-radius ; // X of upper left corner of rectangle
        int ulY = y-radius ; // Y of upper left corner of rectangle
        gr.drawOval( ulX, ulY, 2*radius, 2*radius );
    }
    public void drawc(int x1,int y1, int r, Graphics gr)
    {
        this.x = x1;
        this.y = y1;
        this.radius=r;
        this.draw(gr);
        
        
    }
    public void fill(Graphics gr)
    {
        int ulX = x-radius ; // X of upper left corner of rectangle
        int ulY = y-radius ; // Y of upper left corner of rectangle
        gr.fillOval( ulX +1, ulY+1, 2*radius-2, 2*radius-2 );
        
    }
    
    public void fillRand(Graphics gr)
    {
        int ulX = x-radius ; // X of upper left corner of rectangle
        int ulY = y-radius ; // Y of upper left corner of rectangle
        Random rand = new Random();
        int color = rand.nextInt(5) + 1;
        switch (color)
        {
            case 1: gr.setColor( Color.BLUE );
                break;
            case 2: gr.setColor( Color.RED );
                break;
            case 3: gr.setColor( Color.ORANGE );
                break;
            case 4: gr.setColor( Color.GREEN);
                break;
            case 5: gr.setColor( Color.YELLOW );
                break;
            default:
                break;
        }
        
        
        gr.fillOval( ulX +1, ulY+1, 2*radius-1, 2*radius-1 );
        
    }
    
    public void draws(int x1,int y1, int s, Graphics gr)
    {
       
        gr.drawRect( x1 - s/2, y1 - s/2, s, s );
    }
    
    /**
     * TODO Write your method description here.
     * @param args Command line args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }

}
