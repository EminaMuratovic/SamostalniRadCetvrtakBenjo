import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class NewClass extends JPanel implements ActionListener {
	int frame = 0;
	
		public static void main(String[] args) {
			JFrame window = new JFrame("ja");
			window.setSize(500, 500);
			Dimension dim = new Dimension(500, 500);
			Jesenko panel = new Jesenko(dim);
			window.setContentPane(panel);
			
			Timer t = new Timer(500, panel);
			t.start();
			
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		
			
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.fillOval(50 + frame , 50 + frame, 50, 50);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			frame++;
			repaint();
			
		}
	}


