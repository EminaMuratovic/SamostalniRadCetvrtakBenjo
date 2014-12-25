import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class Jesenko extends JPanel implements ActionListener{
	
	Dimension windowSize;
	Circle circle1;
	Circle circle2;
	
	public Jesenko(Dimension windowSize) {
		this.windowSize = windowSize;
		circle1 = new Circle(50, 60, 40, false, Color.BLACK, 20, 20, windowSize);
		circle2 = new Circle(20, 30, 40, true, Color.BLACK, 20, 20, windowSize);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		circle1.draw(g);
		circle2.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	
}
