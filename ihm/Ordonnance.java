package ihm;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.event.EventListenerList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Ordonnance extends EventListenerList {

	private JFrame frame;
	private JTextField medField;
	private JTextField showField;
	private JTextField description;

	public Ordonnance() {
		
		
		frame = new JFrame("Ordonnance");
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		frame.getContentPane().setLayout(null);
		
		String labels[] = { "doliprane 500", "panadol 500", "doliprane 1000", "panadol 1000", "aspegic", "fervex", "cefacalm", "dafalgan" };
		
		JList<?> jlist = new JList<Object>(labels);
		
		medField = new JTextField();
		medField.setBounds(48, 83, 289, 39);
		frame.getContentPane().add(medField);
		medField.setColumns(10);
		
		JLabel titre = new JLabel("Choisir medicament: ");
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font("Monospaced", Font.BOLD, 18));
		titre.setBounds(48, 34, 224, 39);
		frame.getContentPane().add(titre);
		
		JScrollPane scrollPane = new JScrollPane(jlist);
		scrollPane.setBounds(46, 144, 806, 162);
		frame.getContentPane().add(scrollPane);
		
		
		JButton addToBase = new JButton("Ajouter dans la base");
		addToBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addToBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addToBase.setBounds(48, 327, 197, 39);
		frame.getContentPane().add(addToBase);
		
		showField = new JTextField("Panadol 1000");
		showField.setBackground(new Color(204, 204, 204));
		showField.setBounds(48, 429, 289, 39);
		frame.getContentPane().add(showField);
		showField.setColumns(10);
		
		description = new JTextField("2 gélule matin et soir aprés les repas pendant 15 jours");
		description.setBounds(48, 493, 806, 61);
		frame.getContentPane().add(description);
		description.setColumns(10);
		
		JButton addButton = new JButton("Ajouter");
		addButton.setBounds(50, 593, 146, 26);
		frame.getContentPane().add(addButton);
		
		JButton jumpButton = new JButton("Saut de ligne");
		jumpButton.setBounds(48, 647, 146, 26);
		frame.getContentPane().add(jumpButton);
		
		JButton CreerButt = new JButton("Creer");
		CreerButt.setBounds(321, 686, 132, 39);
		frame.getContentPane().add(CreerButt);
		
		JButton EffacerButt = new JButton("Effacer");
		EffacerButt.setBounds(498, 686, 146, 39);
		frame.getContentPane().add(EffacerButt);
		
		JButton AnnulerButt = new JButton("Annuler");
		AnnulerButt.setBounds(685, 686, 139, 39);
		frame.getContentPane().add(AnnulerButt);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(321, 580, 535, 82);
		frame.getContentPane().add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		frame.setBounds(100, 100, 922, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
