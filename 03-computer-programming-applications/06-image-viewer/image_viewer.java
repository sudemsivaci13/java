package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File; // importing a file
import java.awt.image.*;
import javax.imageio.*;

public class image_viewer {
	
	private static BufferedImage image = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Simple Image Viewer");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Open Image");
		frame.add(button, BorderLayout.NORTH);
		
		JPanel panel = new JPanel()
				{
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				
				if(image != null)
				{
					int x = (getWidth() - image.getWidth())/2;
					int y = (getHeight() - image.getHeight())/2;
					
					g.drawImage(image, x,  y,  this);	
				}
				
			}
				};
				
		frame.add(panel, BorderLayout.CENTER);
		
		button.addActionListener(new ActionListener () 
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						JFileChooser filechooser = new JFileChooser();
						
						int result = filechooser.showOpenDialog(frame);
						
						if (result == JFileChooser.APPROVE_OPTION)
						{
							
						File selectedfile = filechooser.getSelectedFile();
						
						try 
						{
							image = ImageIO.read(selectedfile);
							
							if(image != null)
							{
								panel.repaint();
							}
							
							else
							{
								JOptionPane.showMessageDialog(frame, "Error!!!", "Valid Image", JOptionPane.ERROR_MESSAGE);
							}
							
						}
						
						catch(Exception ex)
						{
							JOptionPane.showMessageDialog(frame, "Error!!!" + ex.getMessage(), "Valid Image", JOptionPane.ERROR_MESSAGE);
						
						}	
						
						}
						
					}
			
				}); 
		

frame.setVisible(true);
					
	}

}
