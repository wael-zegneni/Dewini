package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AjoutMedicament {
	private JFrame frame;
	private JTextField textFieldNum;
	private JTextField textFieldNom;
	public AjoutMedicament(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel AjoutMedi = new JLabel("Ajouter m\u00E9dicament");
		AjoutMedi.setForeground(Color.WHITE);
		AjoutMedi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		AjoutMedi.setBounds(136, 23, 156, 26);
		frame.getContentPane().add(AjoutMedi);
		
		textFieldNum = new JTextField();
		textFieldNum.setBounds(197, 106, 148, 20);
		frame.getContentPane().add(textFieldNum);
		textFieldNum.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(197, 158, 148, 20);
		frame.getContentPane().add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel labelNumMedi = new JLabel("Num\u00E9ro m\u00E9dicament :");
		labelNumMedi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		labelNumMedi.setForeground(Color.WHITE);
		labelNumMedi.setBounds(21, 106, 148, 14);
		frame.getContentPane().add(labelNumMedi);
		
		JLabel labelNomMedi = new JLabel("Nom m\u00E9dicament :");
		labelNomMedi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		labelNomMedi.setForeground(Color.WHITE);
		labelNomMedi.setBounds(21, 161, 148, 14);
		frame.getContentPane().add(labelNomMedi);
		
		JButton boutonAjout = new JButton("Ajouter dans la base");
		boutonAjout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		boutonAjout.setBackground(Color.WHITE);
		boutonAjout.setForeground(Color.GRAY);
		boutonAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boutonAjout.setBounds(254, 200, 156, 23);
		frame.getContentPane().add(boutonAjout);
		
		frame.setVisible(true);
	}

}