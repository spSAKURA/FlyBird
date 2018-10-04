package animate;

import java.awt.Graphics;

public interface AnimateQueue {
	/**
	 * 动画队列接口
	 */
	
	/**
	 * 绘制当前对象
	 * @param g
	 */
	public void paint(Graphics g);
	/**
	 * 下一帧
	 */
	public void next();
	/**
	 * 点击事件
	 */
	public void onClick();
}
