package flybird;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import animate.AnimateQueue;
import animate.Bird;
import animate.Bullet;
import animate.Gameover;
import animate.Score;
import animate.Text;
import animate.World;
/**
 * ����Ӧ�õ�����
 * @author zhaoj
 */
public class Flybird extends JFrame implements MouseListener {

	public static final int WIDTH = 1800;
	public static final int HEIGHT = 1000;
	public static final String NAME = "Flybird";
	
	static Flybird flybird;
 	static FbPanel fbpanel;
 	
 	public static Thread thread;
 	
 	static List<AnimateQueue> queue;    //��������
 	static Bird bird;
 	static World world;
 	
	public Flybird(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		
		flybird  = new Flybird(NAME);
		
		queue    = new ArrayList<AnimateQueue>();
		
		queue.add(new World());
		queue.add(new Bird());
		queue.add(new Score());
		queue.add(new Bullet());
		queue.add(new Text("Score:",1300,80));
		
		fbpanel  = new FbPanel();           //����
		thread   = new Thread(fbpanel);
		
		thread.start();
		flybird.init();
		
	} 
	/**
	 * �����ʼ��
	 */
	private void init() {
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.add(fbpanel);          //��ӻ���
		this.addMouseListener(this);//��ӵ���¼�
		this.setVisible(true);      //��ʾ����
	}
	/**
	 * ������Ϸ
	 */
	public static void overGame() {
		queue.clear();
		queue.add(new Gameover());
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		fbpanel.onClick();
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
