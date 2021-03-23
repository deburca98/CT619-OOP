/*A more sophisticated Rectangle class  
 * That stores only Cartesian coordinates
 * of 4 corners of the rectangle*/

public class Rectangle 
{
	// Instances
	// using float as its requires less space
	// constraints on space dictated by problem 
	// requirements no x or y larger than 20.0
	
	private float length;
	private float width;
	private float x1,x2,x3,x4;
	private float y1,y2,y3,y4;
	
	// constructor n.b must have same name as class 
	
	public Rectangle (float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4) 
	{
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
		//
		
	}
	
	/* Check for first quadrant position 
	 * This means the x value can't be 
	 * less than zero or greater than 20
	 * same check for y
	 */
	//public 
	
	/**** insert method here ****/
	
	/*method to find length 
	 * needs to extrapolate length from 
	 * Coordinates and assign it to this.length*/
	
	/* method to find width and assign it to 
	 * this . length using coordinates*/
	
	/* method to tell if its square isSquare
	 * It is a square if the length is the same as width.
	 * 
	 */
	
	/*
	 * calculate Area
	 * needs length * width
	 *  */
	
	/* Calculate perimeter
	needs to call length and width */
	
	/* get length*/
	/*get width*/
	
	/* get isSquare
	

}