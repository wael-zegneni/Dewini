package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oo.Medicament;

public class MedicamentDAO {
	
	public Medicament Ajouter(Medicament p) {
		Connection c = ConnexionBD.getConnection();
		if (c != null) {
			try {
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("insert into medicament(numMedicament,nomMedicament) values (?,?);");
				ps.setInt(1, p.getNumMedicament());
				ps.setString(2, p.getNomMedicament());				
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

	
	
	public Medicament Supprimer(Medicament p) {
		
		Connection c = ConnexionBD.getConnection();
		
		if (c != null) {
			try {
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("delete from medicament where id=?;");
				ps.setInt(1, p.getNumMedicament());
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

	public Medicament Modifier(Medicament p) {
		// Connexion à la BD
		Connection c = ConnexionBD.getConnection();
		if (c != null) {
			try {
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("update medicament set nomMedicament=? where numMedicament=?;");
				ps.setString(1, p.getNomMedicament());				
				ps.setInt(2, p.getNumMedicament());
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


}