package projects;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class color_shape_selector extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> colorList;
	private Color selectedColor = Color.BLACK;
	
	private JComboBox<String> shapeList;
	private String selectedShape = "Rectangle";
	
	public color_shape_selector()
	{
		setTitle("Color and Shape Selection");
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("Color:");
		add(l1);
		
		String[] colors = {"Black", "Red", "Green", "Blue"};
		colorList = new JComboBox<>(colors);
		colorList.addActionListener(this);
		add(colorList);
		
		JLabel l2 = new JLabel("Shape:");
		add(l2);
		
		String[] shapes = {"Rectangle", "Oval"};
		shapeList = new JComboBox<>(shapes);
		shapeList.addActionListener(this);
		add(shapeList);
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(selectedColor);
		
		if (selectedShape.equals("Oval"))
		{
			g.fillOval(100,  150,  100,  50);
		}
		
		else
		{
			g.fillRect(100,  150,  100,  50);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new color_shape_selector();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String color = (String) colorList.getSelectedItem();
		
		switch(color)
		{
		case "Red": selectedColor = Color.RED; break;
		case "Green": selectedColor = Color.GREEN; break;
		case "Blue": selectedColor = Color.BLUE; break;
		default: selectedColor = Color.BLACK;
		}
		
		selectedShape = (String) shapeList.getSelectedItem();
		
		repaint();
	}

}
