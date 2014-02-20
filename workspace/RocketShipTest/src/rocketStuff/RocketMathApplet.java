/**
 * 
 */
package rocketStuff;

import java.awt.Graphics;

/**
 * Wrapper Class for the DrawGraph class to use with the copy method.
 * 
 * @author Tanmay Chordia
 * @date  2/19/2014
 * @see RocketMath Class, DrawGraph
 * @version 2
 *
 */


public class RocketMathApplet extends RocketMath  {

/* 
 * See RocketMath class
 * */
	
	public RocketMathApplet(double m0, double mW, double vB, double p0, double cD, double rBot, double rNoz)
	{
		super(m0, mW, vB, p0, cD, rBot, rNoz);
		
	}
	
	
    public RocketMathApplet copy() {
    	RocketMathApplet a = new RocketMathApplet(m0,mW,vB, p0, cD,  rBot,  rNoz);
    	return a;
    }
}
	
	/**
	 * @return iP, return the internal air pressure of the water bottle rocket
	 */
	