package animate;

import flybird.Flybird;

public class Gameover extends Text{
	
	public Gameover() {
		super("", Flybird.WIDTH / 2,Flybird.HEIGHT);
	}

	
	public void next() {
		this.text ="Gameover     Your Score Is :" + Score.score;
		this.x = Flybird.WIDTH - this.text.length() * this.font.getSize();
		this.y -= 2;
		if(this.y < Flybird.HEIGHT/2)
		 Flybird.thread.stop();
	}
}
