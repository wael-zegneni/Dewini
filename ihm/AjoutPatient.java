package ihm;
import dao.PatientDAO;
import oo.Patient;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class AjoutPatient implements ActionListener{
	JButton boutonAnnuler, boutonAjouter;
	JTextField textFieldCodeP, textFieldNomP, textFieldPrenomP, textFieldAdresse, textFieldTel, textFieldDateDeNaissance, textFieldProfession;
	JComboBox<String> comboBoxEtatCivil;
	ButtonGroup bg;
	JFrame fenetre;
	public AjoutPatient() {
		fenetre = new JFrame("Fiche Patient");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelCodeP = new JLabel("Code Patient: ");
		JLabel labelNomP = new JLabel("Nom: ");
		JLabel labelPrenomP = new JLabel("Prenom: ");
		JLabel labelAdresse = new JLabel("Adresse: ");
		JLabel labelTel = new JLabel("Numero de téléphone: ");
		JLabel labelDateDeNaissance = new JLabel("Date de naissance: ");
		JLabel labelProfession = new JLabel("Profession: ");
		JLabel labelEtatCivil = new JLabel("EtatCivil: ");
		JLabel labelSexe = new JLabel("Sexe: ");
		
		textFieldCodeP = new JTextField();
		textFieldNomP = new JTextField();
		textFieldPrenomP = new JTextField();
		textFieldAdresse = new JTextField();
		textFieldTel = new JTextField("+216 ");
		textFieldDateDeNaissance = new JTextField();
		textFieldProfession = new JTextField();
		
		String[] liste = {"", "Célibataire", "Marié(e)", "Divorcé(e)"};
		comboBoxEtatCivil = new JComboBox<String>(liste);
		
		JRadioButton rHomme = new JRadioButton("Homme");
		JRadioButton rFemme = new JRadioButton("Femme");
		
		ButtonGroup bg = new ButtonGroup();
		
		boutonAjouter = new JButton("Ajouter");
		boutonAnnuler = new JButton("Annuler");
		
		bg.add(rHomme);
		bg.add(rFemme);
		
		panel2.add(rHomme);
		panel2.add(rFemme);
		
		panel1.setLayout(new GridLayout(11, 2, 10, 10));
		panel1.add(labelCodeP);
		panel1.add(textFieldCodeP);
		panel1.add(labelNomP);
		panel1.add(textFieldNomP);
		panel1.add(labelPrenomP);
		panel1.add(textFieldPrenomP);
		panel1.add(labelAdresse);
		panel1.add(textFieldAdresse);
		panel1.add(labelTel);
		panel1.add(textFieldTel);
		panel1.add(labelDateDeNaissance);
		panel1.add(textFieldDateDeNaissance);
		panel1.add(labelProfession);
		panel1.add(textFieldProfession);
		panel1.add(labelEtatCivil);
		panel1.add(comboBoxEtatCivil);
		panel1.add(labelSexe);
		panel1.add(panel2);
		panel1.add(boutonAjouter);
		panel1.add(boutonAnnuler);
		boutonAnnuler.addActionListener(this);
		panel1.setBackground(new Color(47, 79, 79));
		
		labelCodeP.setForeground(new Color(194, 194, 202));
		labelNomP.setForeground(new Color(194, 194, 202));
		labelPrenomP.setForeground(new Color(194, 194, 202));
		labelAdresse.setForeground(new Color(194, 194, 202));
		labelTel.setForeground(new Color(194, 194, 202));
		labelDateDeNaissance.setForeground(new Color(194, 194, 202));
		labelProfession.setForeground(new Color(194, 194, 202));
		labelEtatCivil.setForeground(new Color(194, 194, 202));
		labelSexe.setForeground(new Color(194, 194, 202));
		
		rHomme.setForeground(new Color(21, 19, 74));
		rFemme.setForeground(new Color(21, 19, 74));
		
		boutonAjouter.setBackground(new Color(194, 194, 202));
		boutonAjouter.setForeground(new Color(21, 19, 74));
		boutonAnnuler.setBackground(new Color(194, 194, 202));
		boutonAnnuler.setForeground(new Color(21, 19, 74));
		
		fenetre.setContentPane(panel1);
		fenetre.setSize(500, 500);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		fenetre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boutonAnnuler ) {
			fenetre.dispose();
		}
		else if(e.getSource() == boutonAjouter ) {
			PatientDAO pDao = new PatientDAO();
			int codeP = Integer.parseInt(textFieldCodeP.getText());
			int numCin = 123;
			String nomP = textFieldNomP.getText();
			String prenomP = textFieldPrenomP.getText();
			String adresse = textFieldAdresse.getText();
			String tel = textFieldTel.getText();
			String dateNais = textFieldDateDeNaissance.getText();
			String profession = textFieldProfession.getText();
			String etatCivil = (String) comboBoxEtatCivil.getSelectedItem();
			String sexe = "homme";
			
			Patient p = new Patient(codeP,numCin,nomP, prenomP, adresse, tel, dateNais,"", profession, etatCivil, sexe);
			pDao.Ajouter(p);
		}
		
	}
}

