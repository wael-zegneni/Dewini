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

public class HomePageDoc {
	
	HomePageDoc(){
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1215, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Label = new JLabel("Bonjour Docteur");
		Label.setForeground(Color.WHITE);
		Label.setBackground(Color.WHITE);
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("MS UI Gothic", Font.ITALIC, 63));
		Label.setBounds(10, 50, 1181, 74);
		frame.getContentPane().add(Label);
		
		JLabel Label_1 = new JLabel("Patients");
		Label_1.setBackground(Color.WHITE);
		Label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		Label_1.setForeground(Color.WHITE);
		Label_1.setBounds(267, 286, 130, 74);
		frame.getContentPane().add(Label_1);
		
		JLabel Label_3 = new JLabel("30");
		Label_3.setForeground(Color.WHITE);
		Label_3.setHorizontalAlignment(SwingConstants.CENTER);
		Label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		Label_3.setBounds(277, 370, 101, 39);
		frame.getContentPane().add(Label_3);
		
		JButton Button = new JButton("Consulter");
		Button.setForeground(Color.WHITE);
		Button.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		Button.setBackground(new Color(0, 0, 0));
		Button.setBounds(225, 437, 212, 65);
		Button.setSelected(false);
		frame.getContentPane().add(Button);
		
		JLabel Label_2 = new JLabel("Medicaments");
		Label_2.setForeground(Color.WHITE);
		Label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		Label_2.setBounds(791, 304, 243, 39);
		frame.getContentPane().add(Label_2);
		
		JLabel Label_4 = new JLabel("30");
		Label_4.setForeground(Color.WHITE);
		Label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		Label_4.setBounds(875, 370, 43, 39);
		frame.getContentPane().add(Label_4);
		
		JButton Button_1 = new JButton("Consulter");
		Button_1.setForeground(Color.WHITE);
		Button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		Button_1.setBackground(new Color(0, 0, 0));
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button_1.setBounds(791, 437, 196, 63);
		frame.getContentPane().add(Button_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		frame.setJMenuBar(menuBar);
		
		JMenu Menu_3 = new JMenu("Acceuil");
		Menu_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		Menu_3.setForeground(Color.DARK_GRAY);
		menuBar.add(Menu_3);
		
		JMenu Menu = new JMenu("Fichiers");
		Menu.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(Menu);
		
		JMenu Menu_1 = new JMenu("Patients");
		Menu_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(Menu_1);
		
		JMenuItem MenuItem = new JMenuItem("Voir tout");
		MenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_1.add(MenuItem);
		
		JMenuItem MenuItem_1 = new JMenuItem("Ajouter");
		Menu_1.add(MenuItem_1);
		
		JMenu Menu_2 = new JMenu("Aide");
		Menu_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		menuBar.add(Menu_2);
		
		frame.setVisible(true);
	}
}
