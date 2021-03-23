package workshop1;
/*This program tests the rectangle class*/
import javax.swing.JOptionPane;
public class RectangleTest {

	public static void main(String[] args) 
	{
		// call the rectangle class
		// new object myRectangle of class rectangle
		Rectangle rect = new Rectangle();
		float length;
		float width;
		// lth = length & wth = width
		String lthStr, wthStr;
		
		// ask user for length
		//convert to float parse float
		lthStr= JOptionPane.showInputDialog("Enter Length");
		// parse this string to a float as required
		length=Float.parseFloat(lthStr);
		//ask user for width
		
		wthStr=JOptionPane.showInputDialog("Enter Width");
		//convert to float parse float
		width= Float.parseFloat(wthStr);
		
		//width and length can't be less than 0 
		
		if( width <0|length<0) 
		{
			JOptionPane.showMessageDialog(null, 
					"The Value entered cannont be less than Zero ");
			System.exit(0);
		}
		else
			{
			rect.setLength(length);
			rect.setWidth(width);
			JOptionPane.showMessageDialog(null, "The Rectangle of Length" +rect.getLength() 
			+"\n & Width" +rect.getWidth() +"\n Has an Area of " +rect.Area()  
			+"\n & Perimeter" +rect.Perimeter() );
			}
			
	}

}
