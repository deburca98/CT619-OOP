package sandbox;

import javax.swing.JFrame;



public class Q1Wk7Test implements Runnable{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ball");
		Ball ball = new Ball();
		frame.add(ball);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
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

	@Override
	public void run() {
		Thread t = new Thread(this);
		t.start();
		
	}

	
}
