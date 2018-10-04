package animate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Text implements AnimateQueue{
	
	int x;
	int y;
	String text;
	Font font;
	Color color;
	
	public Text(String text ,int x, int y) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.x    = x;
		this.y    = y;
		this.font = new Font("Microsoft Yahei",0,40);
		this.color = Color.black;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setFont(this.font);
		g.setColor(this.color);
		g.drawString(this.text, this.x, this.y);
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
