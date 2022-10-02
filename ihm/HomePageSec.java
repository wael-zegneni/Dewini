package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class HomePageSec implements ActionListener{
	
	JMenuItem ajouter;
	JButton btnNewButton;
	
	HomePageSec(){
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1215, 788);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bonjour Secretaire");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.ITALIC, 63));
		lblNewLabel.setBounds(10, 50, 1181, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patients");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(267, 286, 130, 74);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("30");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		lblNewLabel_3.setBounds(277, 370, 101, 39);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton = new JButton("Consulter");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(225, 437, 212, 65);
		btnNewButton.setSelected(false);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Medicaments");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblNewLabel_2.setBounds(791, 304, 243, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("30");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		lblNewLabel_4.setBounds(875, 370, 43, 39);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("Acceuil");
		mnNewMenu_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		mnNewMenu_3.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu = new JMenu("Fichiers");
		mnNewMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Patients");
		mnNewMenu_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Voir tout");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		ajouter = new JMenuItem("Ajouter");
		ajouter.addActionListener(this);
		mnNewMenu_1.add(ajouter);
		
		JMenu mnNewMenu_2 = new JMenu("Aide");
		mnNewMenu_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == ajouter || e.getSource() == btnNewButton) {
			new AjoutPatient();
			}
			
	}

}
