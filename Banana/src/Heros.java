import java.awt.image.BufferedImage;

public class Heros {
	private int id;
	private int score;
	private BufferedImage image;
	private int x;
	private int y;
	protected static final int vitesse = 2; 
	
	
	
	
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
}
