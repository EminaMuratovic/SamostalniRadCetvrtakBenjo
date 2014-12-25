import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class Circle {
	
	private int x;
	private int y;
	private int radius;
	private boolean isFilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDimension;
	

	public Circle(int x, int y, int radius, boolean isFilled, Color color, int speedX, int speedY, Dimension windowDimension) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDimension = windowDimension;
	}
	
	public void draw(Graphics g) {
		move();
		g.setColor(color);
		if(isFilled == true) {
			g.fillOval(x, y, radius, radius);
		}	
		else
			g.drawOval(x, y, radius, radius);
	}
	
	private void move() {
		if(x < 0 || x + radius >= windowDimension.getWidth())
			speedY *= -1;
		if(y < 0 || y + radius + 24 >= windowDimension.getHeight())
			speedY *= -1;
		
		
		x += speedX;
		y += speedY;
	}

}
