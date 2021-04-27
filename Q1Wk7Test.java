package sandbox;

import javax.swing.JFrame;



public class Q1Wk7Test  {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ball");
		addBall ball = new addBall();
		frame.add(ball);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// how to use thread but we are using runnable
		while(true) {
			ball.move();
			ball.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
