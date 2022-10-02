package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class Consultations implements ActionListener{
	private JFrame frame;
	JButton bouton = new JButton(); 
	JTextField textNom, textPrenom;
	
	public Consultations() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		frame.getContentPane().setLayout(null);
		
		JButton bouton = new JButton("Rechercher");
		bouton.addActionListener(null);
		bouton.setBackground(new Color(255, 255, 255));
		bouton.setFont(new Font("Corbel Light", Font.BOLD, 18));
		bouton.setBounds(437, 120, 214, 67);
		frame.getContentPane().add(bouton);
		
		textPrenom = new JTextField("Prenom");
		textPrenom.setBounds(31, 107, 315, 47);
		frame.getContentPane().add(textPrenom);
		textPrenom.setColumns(10);
		
		textNom = new JTextField("Nom");
		textNom.setHorizontalAlignment(SwingConstants.LEFT);
		textNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNom.setBounds(31, 164, 315, 47);
		frame.getContentPane().add(textNom);
		textNom.setColumns(10);
		
		JPanel textArea = new JPanel();
		JLabel label = new JLabel();
		textArea.add(label);
		textArea.setBounds(437, 309, 425, 325);
		frame.getContentPane().add(textArea);
		
		
		JButton boutonAjouter = new JButton("Ajouter ");
		boutonAjouter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boutonAjouter.setBounds(636, 673, 214, 36);
		frame.getContentPane().add(boutonAjouter);
		
		String colonnes[] = {"Date", "Titre"};
		String data[][] = new String [100][2];
		DefaultTableModel model = new DefaultTableModel(data,colonnes);
		JTable table = new JTable(model);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 309, 315, 325);
		frame.getContentPane().add(scrollPane);

		scrollPane.setViewportView(table);

		
		frame.setBounds(100, 100, 922, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bouton) {
			
			java.sql.Connection cn;
			try {
				String url = "jdbc:postgresql://localhost:5432/Medical"; 
				String user = "postgres"; 
				String passwd = "wael24445983";  
				
				cn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement ps = cn.prepareStatement("select C.dateConsult, C.typeConsult from consultation C, Patient P  where P.codeP = C.codeP and P.nomP = ? ");
				ResultSet rs = ps.executeQuery();
				String colonnes[] = {"Date", "Titre"};
				String data[][] = new String [100][2];
				int i = 0;
				
				while(rs.next()) {
					String date = rs.getString("date");
					String type = rs.getString("type");
					data[i][0] = date;
					data[i][1] = type;
				}
						
				
				DefaultTableModel model = new DefaultTableModel(data,colonnes);
				JTable table = new JTable(model);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(31, 309, 315, 325);
				frame.getContentPane().add(scrollPane);
		
				scrollPane.setViewportView(table);


			} catch (SQLException e1) {
				e1.printStackTrace();
			}				
			
			
		}
		
	}
}
