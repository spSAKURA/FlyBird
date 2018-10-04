package animate;

import flybird.FbPanel;

public class Score extends Text{
	/**
	 * 绘制可变分数类
	 */
	final static int X = 1500;
	final static int Y = 80;
	
	static int score = 0;
	
	public Score() {
		super("", X, Y);
		// TODO Auto-generated constructor stub
	}
	
	public void next() {
		if(FbPanel.timeline % 100 == 0)
			Score.score += 10;
		this.text = String.valueOf(this.score);
	}

}
