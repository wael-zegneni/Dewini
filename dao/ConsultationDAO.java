package dao;

import oo.*;
import java.sql.*;

public class ConsultationDAO {
	public void Ajouter(Consultation c) {
		Connection cn = ConnexionBD.getConnection();
		if (c != null) {
			try {
				cn.setAutoCommit(false);
				PreparedStatement ps = cn.prepareStatement("insert into Consultation(numConsultation, dateConsultatuon, type, remarque, numFich) values(?,?,?,?,?)");
				ps.setInt(1, c.getNumConsultation());
				ps.setString(2, c.getDateConsultation());
				ps.setString(3, c.getType());
				ps.setString(4, c.getRemarque());
				ps.setInt(5, c.getNumFich());
				int res = ps.executeUpdate();
				if (res != 0) { 
					cn.commit();
				}
			} catch (SQLException e) { e.printStackTrace();  }
			catch (Exception e) { e.printStackTrace();  }
		}
	}
}
