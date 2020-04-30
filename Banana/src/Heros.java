import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Heros {
	private int id;
	private int score;
	private BufferedImage image;
	private int x;
	private int y;
	protected static final int vitesse = 2; 
	private boolean up = false, down = false, right=false, left=false;




	public Heros(int id, int score, BufferedImage image, int x, int y) {
		this.id = id;
		this.score = score;
		this.image = image;
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	public void tick() {
		if(isUp()) y-=vitesse;
		if(isDown()) y+=vitesse;
		if(isRight()) x+=vitesse;
		if(isLeft()) x-=vitesse;
	}
	
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, 32, 32);	
	}
	
	public boolean isUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public boolean isDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
}
