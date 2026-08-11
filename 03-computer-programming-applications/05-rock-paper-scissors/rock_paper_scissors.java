package projects;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class rock_paper_scissors extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel computerChoiceLabel;
	private JLabel resultLabel;
	private JLabel computerImageLabel;
	private Random random;
	
	private ImageIcon rockIcon;
	private ImageIcon paperIcon;
	private ImageIcon scissorIcon;
	
	public rock_paper_scissors ()
	{
		setTitle("Rock Paper Scissors Game");
		setSize(650, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		random = new Random();
		
		rockIcon = resizeIcon("rock.jpeg", 120, 120);
		paperIcon = resizeIcon("paper.jpeg", 120, 120);
		scissorIcon = resizeIcon("scissor.jpeg", 120, 120);
		
		add(new JLabel ("Choice your move: "));
		
		JButton rockButton = new JButton(rockIcon);
		add(rockButton);
		
		JButton paperButton = new JButton(paperIcon);
		add(paperButton);
		
		JButton scissorButton = new JButton(scissorIcon);
		add(scissorButton);
		
		computerChoiceLabel = new JLabel("Computer's choice: ");
		add(computerChoiceLabel);
		
		computerImageLabel = new JLabel();
		add(computerImageLabel);
		
		resultLabel = new JLabel("Result: ");
		add(resultLabel);
		
		rockButton.addActionListener(e->play("Rock"));
		paperButton.addActionListener(e->play("Paper"));
		scissorButton.addActionListener(e->play("Scissor"));
		
		setVisible(true);
		
	}
	
	private ImageIcon resizeIcon(String filename, int width, int height) {
		// TODO Auto-generated method stub
		
		ImageIcon icon = new ImageIcon(filename);
		Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(image);
		
	}
	
	
	private void play(String userChoice)
	{
		String[] option = {"Rock", "Paper", "Scissor"};
		
		String computerChoice = option[random.nextInt(3)];
		
		switch(computerChoice)
		{
		case "Rock": computerImageLabel.setIcon(rockIcon); break;
		case "Paper": computerImageLabel.setIcon(paperIcon); break;
		case "Scissor": computerImageLabel.setIcon(scissorIcon); break;
		}
		
		computerChoiceLabel.setText("Computer's Choice: " + computerChoice);
		
		String result;
		
		if(userChoice.equals(computerChoice))
		{
			result = "Draw";
		}
		
		else if ((userChoice.equals("Rock") && computerChoice.equals("Scissor")) || (userChoice.equals("Paper") && computerChoice.equals("Rock")) || (userChoice.equals("Scissor") && computerChoice.equals("Paper")))
		{
			result = "You Win!";
		}
		
		else
		{
			result = "You Lose!";
		}
		
		resultLabel.setText("Result: " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

new rock_paper_scissors();

	}

}
