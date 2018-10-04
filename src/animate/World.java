package animate;

import java.awt.Color;
import java.awt.Graphics;

import flybird.Flybird;

public class World implements AnimateQueue{
	final static int g = 1;
	final static int MAX_HEIGHT = 100;
	public final static int MIN_HEIGHT = 900;
	final static Color LINECOLOR = Color.BLACK;
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(World.LINECOLOR);
		g.drawLine(0, MAX_HEIGHT, Flybird.WIDTH, MAX_HEIGHT);
		
		g.drawLine(0, MIN_HEIGHT, Flybird.WIDTH, MIN_HEIGHT);
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

}
