package projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class food_ordering_system extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;
	
	food_ordering_system()
	{
		setTitle("Food Ordering System");
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l = new JLabel("Food Ordering System");
		l.setBounds(50, 50, 300, 20);
		add(l);
		
		cb1 = new JCheckBox("Pizza @ 100");
		cb1.setBounds(100, 100, 150, 20);
		add(cb1);
		
		cb2 = new JCheckBox("Burger @ 30");
		cb2.setBounds(100, 150, 150, 20);
		add(cb2);
		
		cb3 = new JCheckBox("Tea @ 10");
		cb3.setBounds(100, 200, 150, 20);
		add(cb3);
		
		b = new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		add(b);
		
		setVisible(true);
		
		b.addActionListener(this);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

new food_ordering_system();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		float total = 0;
		String msg = "";
		
		if (cb1.isSelected())
		{
			total += 100;
			msg = "Pizza: 100\n";
		}
		
		if (cb2.isSelected())
		{
			total +=30;
			msg += "Burger: 30\n";
		}
		
		if (cb3.isSelected())
		{
			total += 10;
			msg += "Tea: 10\n";
		}
		
		msg += "-------------\n";
		
		JOptionPane.showMessageDialog(this, msg + "Total: " + total);
		
	}

}
