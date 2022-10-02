package dao;
import oo.*;
import java.sql.*;

public class PatientDAO {


		public Patient Ajouter(Patient p) {
			Connection c = ConnexionBD.getConnection();
			if (c != null) {
				try {
					c.setAutoCommit(false);
					PreparedStatement ps = c.prepareStatement("insert into produit(numFich, cin, nom, prenom, adresse, dateAdresse, num, ville, codePostal, etat, sexe ) values (?,?,?,?,?,?,?,?,?,?,?);");
					ps.setInt(1, p.getNumFich());
					ps.setInt(2, p.getCin());
					ps.setString(3, p.getNom());
					ps.setString(4, p.getPrenom());
					ps.setString(5, p.getAdresse());
					ps.setString(6, p.getDateNaissance());
					ps.setString(7, p.getNum());
					ps.setString(8, p.getVille());	
					ps.setString(9, p.getCodePostal());
					ps.setString(10, p.getEtat());
					ps.setString(11, p.getSexe());
					int res = ps.executeUpdate();
					if (res != 0) { 
						c.commit();
						return p;
					}
				} catch (SQLException e) { e.printStackTrace();  }
				catch (Exception e) { e.printStackTrace();  }
			}
			return null;
		}

		public Patient Supprimer(Patient p) {
		
			Connection c = ConnexionBD.getConnection();
			
			if (c != null) {
				try {
					c.setAutoCommit(false);
					PreparedStatement ps = c.prepareStatement("delete from produit where id=?;");
					ps.setInt(1, p.getNumFich());
					int res = ps.executeUpdate();				
					if (res != 0) { 
						c.commit();
						return p;
					}
				} catch (SQLException e) { e.printStackTrace();  }
				catch (Exception e) { e.printStackTrace();  }
			}
			return null;
		}

		public Patient Modifier(Patient p) {
			// Connexion à la BD
			Connection c = ConnexionBD.getConnection();
			// Définition et exécution de la requête de modification
			if (c != null) {
				try {
					c.setAutoCommit(false);
					PreparedStatement ps = c.prepareStatement("update produit set cin=?, nom=?, prenom=?, adresse=?, dateAdresse=?, num=?, ville=?, codePostal=?, etat=?, sexe where id=?;");
					ps.setInt(1, p.getCin());
					ps.setString(2, p.getNom());
					ps.setString(3, p.getPrenom());
					ps.setString(4, p.getAdresse());
					ps.setString(5, p.getDateNaissance());
					ps.setString(6, p.getNum());
					ps.setString(7, p.getVille());	
					ps.setString(8, p.getCodePostal());
					ps.setString(9, p.getEtat());
					ps.setString(10, p.getSexe());
					ps.setInt(11, p.getNumFich());
					int res = ps.executeUpdate();
					if (res != 0) { 
						c.commit();
						return p;
					}
				} catch (SQLException e) { e.printStackTrace();  }
				catch (Exception e) { e.printStackTrace();  }
			}
			return null;
		}

		public Patient RechercherParId(int numFich) {
			Patient p = null;
			// Connexion à la BD
			Connection c = ConnexionBD.getConnection();
			// Définition et exécution de la requête select
			if (c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("select * from produit where numFich=?;");		
					ps.setInt(1, numFich);
					ResultSet res = ps.executeQuery();
					if (res.next()) { // Activer le commit uniquement si la requête s'est exécuté sans problème
						p = new Patient(numFich,res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10) );
					}
				} catch (SQLException e) { e.printStackTrace();  }
				catch (Exception e) { e.printStackTrace();  }
			}
			return p;
		}

}

