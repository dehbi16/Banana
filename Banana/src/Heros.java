import java.awt.image.BufferedImage;

public class Heros {
	private int id;
	private int score;
	private BufferedImage image;
	
	
	
	
	public Heros(int id, int score, BufferedImage image) {
		this.id = id;
		this.score = score;
		this.image = image;
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
	
	

}
