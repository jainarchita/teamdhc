// Program bounces a ball around the applet
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball4 extends JApplet
{
private final int DIAMETER = 10;
private final int MAX_X = 200, MAX_Y = 200;
private final int MAX_BALLS = 20;
private BallThread[] balls;
private int count;

public void init()
{
count = 0;

balls = new BallThread[ 20 ];

// let Ball Applet be its own MouseListener
addMouseListener(

new MouseAdapter() { // anonymous inner class

public void mousePressed( MouseEvent event )
{
createBall( event ); // delegate call to ball starter
}

} // end anonymous inner class

); // end call to addMouseListener
setSize( MAX_X, MAX_Y ); // set size of Applet
}

// creates a ball and sets it in motion
private void createBall( MouseEvent event )
{
if ( count < MAX_BALLS ) {
int x = event.getX();
int y = event.getY();
balls[ count ] = new BallThread( x, y );

balls[ count ].start(); // start ball's bouncing
count++;
}
}

// called if applet is closed. by setting ball to null,
// threads will be ended.
public void stop()
{
for ( int i = 0; i < count; i++ )
balls[ i ] = null;

count = 0;
}

// draws ball at current position
public void paint( Graphics g )
{
super.paint( g );

for ( int i = 0; i < count; i++ ) {

for ( int j = 0; j < i; j ++ )
if ( balls[ i ].collide( balls[ j ] ) ) {
balls[ i ].collision();
balls[ j ].collision();
}

g.setColor( Color.darkGray );
g.fillOval( balls[ i ].getX(), 195, DIAMETER, DIAMETER / 2 );

g.setColor( balls[ i ].getColor() );
g.fillOval( balls[ i ].getX(), balls[ i ].getY(),
DIAMETER, DIAMETER );
}
}

// class that represents one ball
private class BallThread extends Thread {
private Color color;
private int x, y;
private boolean xUp, yUp;
private int xDx, yDy;
private final int MAX_X = 200, MAX_Y = 200;

public BallThread( int xCoord, int yCoord ) {
// initialize all the variables
xUp = false;
yUp = false;
xDx = 1;
yDy = 1;
x = xCoord;
y = yCoord;

// create a random color for the ball
color = new Color( (float)Math.random(), (float)Math.random(),
(float)Math.random() );
}

// return the color
public Color getColor() {
return color;
}

// return the x position
public int getX() {
return x;
}

// return the y position
public int getY() {
return y;
}

// action to perform on execution, bounces ball
// perpetually until applet is closed.
public void run()
{
while ( true ) {

// sleep for a random interval
try {
Thread.sleep( 20 );
}

// process InterruptedException during sleep
catch ( InterruptedException exception ) {
// applet is closing
}

// determine new x position
if ( xUp == true )
x += xDx;
else
x -= xDx;
//determine new y position
if ( yUp == true )
y += yDy;
else
y -= yDy;

// randomize variables for creating next move
if ( y <= 0 ) {
yUp = true;
yDy = ( int ) ( Math.random() * 5 + 2 );
}

else if ( y >= MAX_Y - DIAMETER ) {
yDy = ( int ) ( Math.random() * 5 + 2 );
yUp = false;
}

if ( x <= 0 ) {
xUp = true;
xDx = ( int ) ( Math.random() * 5 + 2 );
}

else if ( x >= (MAX_X - DIAMETER) ) {
xUp = false;
xDx = ( int ) ( Math.random() * 5 + 2 );
}

repaint();

} // end while

} // end method run

public void collision()
{
xUp = !xUp;
xDx = ( int ) ( Math.random() * 5 + 2 );
yUp = !yUp;
yDy = ( int ) ( Math.random() * 5 + 2 );
}

public boolean collide( BallThread other )
{
if ( ( ( x - other.getX() ) * ( x - other.getX() ) +
( y - other.getY() ) * ( y - other.getY() ) ) < 100 )
return true;
else
return false;
}

} // end class BallThread

} // end class Ball4