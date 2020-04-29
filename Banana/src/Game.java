import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

	/**dfbfb
	 * yass
	 */
	private static final long serialVersionUID = 1L;
	private boolean isRunning = false;
	private Thread thread;
	int height = 700;
	int width = 600; 
	
	public Game() {
		new Window(width, height, "Game", this);
		
		
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
		
	}

	

	private void render() {
		// TODO Auto-generated method stub
		
	}

}
