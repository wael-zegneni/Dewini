package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HomePage implements ActionListener {
	
	JButton logIn;
	JRadioButton doctorButton;
	
	HomePage() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1215, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(334, 178, 582, 435);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
		lblNewLabel.setBounds(10, 10, 562, 84);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email :");
		lblNewLabel_1.setFont(new Font("Book Antica", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(40, 104, 100, 45);
		panel.add(lblNewLabel_1);
		
		
		JTextField textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(40, 153, 174, 26);
		panel.add(textField);
		
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Book Antica", Font.BOLD, 15));
		lblNewLabel_2.setBounds(40, 207, 100, 30);
		panel.add(lblNewLabel_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(40, 247, 174, 26);
		panel.add(textField_1);
		
		
		doctorButton = new JRadioButton("Docteur");
		JRadioButton secretaireButton = new JRadioButton("Secretaire");
		secretaireButton.setBackground(Color.DARK_GRAY);
		secretaireButton.setForeground(Color.WHITE);
		secretaireButton.setFocusable(false);
		
		doctorButton.setBackground(Color.DARK_GRAY);
		doctorButton.setForeground(Color.WHITE);
		doctorButton.setFocusable(false);
		
		doctorButton.setBounds(44, 300, 90, 19);
		secretaireButton.setBounds(135, 300, 90, 19);
		
		ButtonGroup group = new ButtonGroup();
		group.add(doctorButton);
		group.add(secretaireButton);
		
		panel.add(doctorButton);
		panel.add(secretaireButton);
		
		logIn = new JButton("Se connecter");
		logIn.setBounds(360, 190, 150, 50);
		logIn.setFont(new Font("Book Antica",Font.BOLD, 12));
		logIn.setForeground(Color.white);
		logIn.setBackground(Color.LIGHT_GRAY);
		logIn.setFocusable(false);
		
		logIn.addActionListener(this);
		
		panel.add(logIn);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == logIn) {
			new HomePageSec();
		}
		
	}
}
