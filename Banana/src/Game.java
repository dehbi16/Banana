import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


public class Game extends Canvas implements Runnable {

	/**dfbfb
	 * yass
	 */
	private static final long serialVersionUID = 1L;
	private boolean isRunning = false;
	private Thread thread;
	public static final int WIDTH= 800, HEIGHT=WIDTH/12*9;
	Heros hero;
	KeyInput keyInput;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "Game", this);
		hero = new Heros(100, 100, null, 50, 50);
		keyInput = new KeyInput(hero);
		this.addKeyListener(keyInput);

		start();
	}
	
	private void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	private void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(isRunning) {
			long now = System.nanoTime();
			delta += (now-lastTime)/ns;
			lastTime = now;
			while(delta>=1) {
				tick();
				delta--;
			}
			render();
			frames++;
			if(System.currentTimeMillis() - timer>1000) {
				timer+= 1000;
				//	System.out.println("FPS: "+frames);
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		// TODO Auto-generated method stub
		hero.tick();
	}

	

	private void render() {
		// TODO Auto-generated method stub
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		hero.render(g);
		
		g.dispose();
		bs.show();
	}

}
