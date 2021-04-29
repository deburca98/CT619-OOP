package sandbox;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;





public class Ball extends JPanel   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// I imported this class to create the random position 
	// creates a random position for the ball on startup
	private Random randomGenerator = new Random();
	// generates random x & y position in move method
	int x=0 + randomGenerator.nextInt( 201 ), y=0+ randomGenerator.nextInt( 201 );
	int anglex =1, angley =1;// used for changing direction 
	// generate random colors 
	float red = randomGenerator.nextFloat();
	float green= randomGenerator.nextFloat();;
	float blue =randomGenerator.nextFloat();
	
	// this method moves the ball
	void move(){
		if(x + anglex <0) {
			anglex=1;
		}else if (x +anglex > getWidth()-50) { // used library getwidth instead
			anglex =-1;
		} else if (y + angley <0) {
			angley = 1;
		} else if (y + angley > getHeight() -50) { 
			angley = -1;
		}
			x =x + anglex;
			y= y+ angley;
	}
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		// create new random colour by changing the float values for colors
		Color randomColor = new Color(red, green ,blue);
		g.setColor(randomColor);
		g.fillOval(x, y , 50, 50);// ball is set to 50 by 50
		
		
		
			
	
	}

	

}
