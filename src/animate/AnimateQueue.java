package animate;

import java.awt.Graphics;

public interface AnimateQueue {
	/**
	 * �������нӿ�
	 */
	
	/**
	 * ���Ƶ�ǰ����
	 * @param g
	 */
	public void paint(Graphics g);
	/**
	 * ��һ֡
	 */
	public void next();
	/**
	 * ����¼�
	 */
	public void onClick();
}
