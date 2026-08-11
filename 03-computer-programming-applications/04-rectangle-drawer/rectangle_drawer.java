package projects;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class rectangle_drawer extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private int startX, startY;
	private int currentX, currentY;
	private boolean dragging = false;
	
	public rectangle_drawer()
	{
		addMouseListener(new MouseAdapter(){
			
			public void mousePressed(MouseEvent e) {
				startX = e.getX();
				startY = e.getY();
				
				dragging = true;
			}
			
			public void mouseReleased(MouseEvent e) {
				dragging = false;
				
				repaint();
			}
			
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				currentX = e.getX();
				currentY = e.getY();
				
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		if (dragging) 
		{
			g.setColor(Color.ORANGE);
			
			int x = Math.min(startX, currentX);
			int y = Math.min(startY, currentY);
			
			int width = Math.abs(currentX - startX);
			int height = Math.abs(currentY - startY);
			
			g.drawRect(x, y, width, height);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

JFrame frame = new JFrame("Draw Rectangle");

rectangle_drawer panel = new rectangle_drawer();

frame.add(panel);
frame.setSize(600, 400);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setVisible(true);

	}

}
