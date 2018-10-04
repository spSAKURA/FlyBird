package animate;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import flybird.FbPanel;
import flybird.Flybird;
/**
 * 子弹类
 */
public class Bullet implements AnimateQueue {
	
	static List<Bulletunit> bl;
	

	static int speed = 2;         //子弹移动速度
	
	final static int WIDTH  = 20;   //子弹宽度
	final static int HEIGTH = 20;
	
	static int interval = 500;//产生子弹的时间间隔
	
	public Bullet() {
		bl = new ArrayList<Bulletunit>();
	}
	
	private void addRandBullete() {
		this.addBullete(
				Flybird.WIDTH,
				(int)(Math.random()*(World.MIN_HEIGHT-World.MAX_HEIGHT) + World.MAX_HEIGHT)
				);
	}
	private void addBullete(int x,int y) {
		bl.add(new Bulletunit(x, y));
	}
	
	public static boolean isBeKill(Bird b) {
		for(int i=0;i<bl.size();i++){
			if(bl.get(i).inSqrt(b))
				return true;
		}
		return false;
			
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		for(int i=0;i<bl.size();i++) {
			g.setColor(bl.get(i).color);
			g.fillRect(bl.get(i).x,
					bl.get(i).y,
					WIDTH,
					HEIGTH
					);
			}

	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(Score.score % 100 == 0 && interval>100)
			interval -= 80;
		
		if(FbPanel.timeline % interval == 0)
			this.addRandBullete();
		
		for(int i=0;i<bl.size();i++) {
			bl.get(i).x -= speed ;
			if(bl.get(i).x < 0) {
				bl.remove(i);
				i --;
			}
		}
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

}

class Bulletunit{
	int x;
	int y;
	Color color ;
	Bulletunit(int x,int y){
		this.x = x;
		this.y = y;
		List<Color> c = new ArrayList<Color>();
		c.add(Color.blue);
		c.add(Color.red);
		c.add(Color.yellow);
		c.add(Color.pink);
		c.add(Color.orange);
		c.add(Color.pink);
		c.add(Color.green);
		
		int size = c.size();
		this.color = c.get((int)(Math.random()*size));
		
	}
	
	boolean inSqrt(Bird b) {
		if((      this.x                 < b.x
				&&this.x + Bullet.WIDTH  > b.x
				&&this.y                 < b.y
				&&this.y + Bullet.HEIGTH > b.y)
			||	(      b.x            < this.x
					&& b.x + b.width  > this.x
					&& b.y            < this.y
					&& b.y + b.height > this.y
					))
			return true;
		return false;
	}
}