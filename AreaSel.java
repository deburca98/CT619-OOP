package workshop1;
import javax.swing.JOptionPane;
public class AreaSel {
	public static void main(String[] args)
	{
		// These values will hold data as a double after conversion 
		double  shape, width, height;
		// String holder for data input
		String shapeStr, widthStr, heightStr;
		// area variable initialized 
		double area = 0;
		// string input for shape selection 	
		shapeStr=JOptionPane.showInputDialog("Select Shape, 1 for Triangle, 2 for Rectangle");
		// conversion of string input to double 
		shape=Double.parseDouble(shapeStr);
		// string input for width selection 
		widthStr=JOptionPane.showInputDialog("Enter Width");
		// conversion of string input to double 
		width=Double.parseDouble(widthStr);
		// string input for width selection 
		heightStr=JOptionPane.showInputDialog("Enter Height");
		// conversion of string input to double 
		height=Double.parseDouble(heightStr);
		
		// conditional selection statements
		// Test for Triangle
		if (shape == 1 ) {
			area = (width* 0.5) *height;
			JOptionPane.showMessageDialog(null, "The area of the Triangle is " + area);
		}
		// else test for Rectangle
		else {
			if(shape == 2) {
				area = width*height;
				JOptionPane.showMessageDialog(null, "The area is of the rectangle is  " + area);
			}
			else {
				if (shape != 1 || shape !=2) {
					JOptionPane.showMessageDialog(null,"you have entered an invalid shape selection number");
					System.exit(0);
				}
			}
		}
		JOptionPane.showMessageDialog(null, "The area is " + area);
		
	}
	
}
