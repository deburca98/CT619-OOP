package sandbox;

import java.awt.Graphics;
import javax.swing.JPanel;

public class addBall extends JPanel   {
	int x=0, y=0;
	int anglex =1, angley =1;
	
	
	// this method moves the ball
	void move(){
		if(x + anglex <0) {
			anglex=1;
		}else if (x +anglex > getWidth()-50) {
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
		g.fillOval(x, y, 50, 50); // ball is set to 50 by 50
	}

	

}
