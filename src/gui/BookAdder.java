package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JFrame{
	
	public BookAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelAuther = new JLabel("Auther : ", JLabel.TRAILING);
		JTextField fieldAuther = new JTextField(10);
		labelAuther.setLabelFor(fieldAuther);
		panel.add(labelAuther);
		panel.add(fieldAuther);
		
		JLabel labelPublisher = new JLabel("Publisher : ", JLabel.TRAILING);
		JTextField fieldPublisher = new JTextField(10);
		labelPublisher.setLabelFor(fieldPublisher);
		panel.add(labelPublisher);
		panel.add(fieldPublisher);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
