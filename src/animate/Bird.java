package animate;

import java.awt.Color;
import java.awt.Graphics;

import flybird.FbPanel;
import flybird.Flybird;

public class Bird implements AnimateQueue {
	int x = 100;
	int y = 300;
	final int width = 60;
	final int height = 30;
	
	static int life = 1;
	
	int speed_y = 0;
	int timeline = 0;
	final int JUMP_SPEED = -4;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(this.x, this.y, this.width, this.height);
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		this.checkStatus();
		this.y += this.speed_y;
		if(FbPanel.timeline % 10 == 0)
			this.speed_y += World.g;
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		this.speed_y = this.JUMP_SPEED;
	}	
	
	public void checkStatus() {
		if(this.y + this.height > World.MIN_HEIGHT 
				|| this.y < World.MAX_HEIGHT
				|| Bullet.isBeKill(this))
			life --;
		if(life < 1)
			Flybird.overGame();
	}
	
}
