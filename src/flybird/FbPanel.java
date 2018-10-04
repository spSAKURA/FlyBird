package flybird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import animate.*;

public class FbPanel extends JPanel	implements Runnable{
	/**
	 * Ö÷»­°å
	 */
	final public static int INTERVAL = 10;
	public static int timeline = 0;
	
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, Flybird.WIDTH, Flybird.WIDTH);
		for(int i=0; i<Flybird.queue.size(); i++) {
			Flybird.queue.get(i).paint(g);
		}
	}
	
	public void next() {
		for(int i=0; i<Flybird.queue.size(); i++) {
			Flybird.queue.get(i).next();
		}
	}
	
	public void onClick() {
		// TODO Auto-generated method stub
		for(int i=0; i<Flybird.queue.size(); i++) {
			Flybird.queue.get(i).onClick();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(FbPanel.INTERVAL);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.next();
			timeline ++;
			this.repaint();
		}
	}
	

}
