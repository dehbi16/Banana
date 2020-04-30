import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;





public class KeyInput extends KeyAdapter {
	Heros hero;	
	public KeyInput(Heros h){
		this.hero = h;
	}
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();


		if(key == KeyEvent.VK_UP) hero.setUp(true);
		if(key == KeyEvent.VK_DOWN) hero.setDown(true);
		if(key == KeyEvent.VK_LEFT) hero.setLeft(true);
		if(key == KeyEvent.VK_RIGHT) hero.setRight(true);


	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP) hero.setUp(false);
		if(key == KeyEvent.VK_DOWN) hero.setDown(false);
		if(key == KeyEvent.VK_LEFT) hero.setLeft(false);
		if(key == KeyEvent.VK_RIGHT) hero.setRight(false);
	}
	

}
