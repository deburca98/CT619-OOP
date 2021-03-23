package workshop1;
/* A rectangle class implements a simple rectangle class*/
import javax.swing.JOptionPane;
public class Rectangle 
{
	// two variables declared 
	private float length;
	private float width;

	// Constructors this sets default values
	public Rectangle()
	{
		/* using keyword this to refer to variables/ Attributes 
		 * declared above 
		 */
		this.length= 1;// default setting
		this.width =1; // default setting 
				
	}
	/******************Calculation*******************/
	//method to calculate the Area
	public float Area() 
	{
		return (this.length*this.width);		
	}
	// method to calculate the Perimeter
	// multiply length variable by 2  and add to width multiplied by 2 
	public float Perimeter()
	{
		return (this.length *2)+ (this.width *2);	
	}
	
	/******************Setters**********************/
	// length setter with error detection and information to user on invalid entry amount
	public void setLength(float lth)
	{
		if(lth>0.0 && lth <20.0)
		{
		this.length =lth;
		}
		else {
			JOptionPane.showMessageDialog(null, 
					"Invalid length , values must be > 0.0 and < 20.0 you entered " +lth);
			System.exit(0);	
		}
			
	}
`	// width setter with error detection and information to user on invalid entry amount
	public void setWidth(float wth)
	{
		if(wth>0.0 && wth <20.0)
		{
		this.width =wth;
		}
		else {
			JOptionPane.showMessageDialog(null, 
					"Invalid width, values must be > 0.0 and < 20.0 you entered " + wth);
			System.exit(0);	
		}
			
	}
	
	/******************Getters**********************/
	
	public float getLength()
	{
		return length;
	}
	
	public float getWidth()
	{
		return width;
	}

		
}
