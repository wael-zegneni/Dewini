package oo;


public class Patient {
	int numFich;
	int cin;
	String nom;
	String prenom;
	String adresse;
	String dateNaissance;
	String num;
	String ville;
	String codePostal;
	String etat;
	String sexe;
	
	

	public Patient(int numFich, int cin, String nom, String prenom, String adresse, String dateNaissance, String num,
			String ville, String codePostal, String etat, String sexe) {
		super();
		this.numFich = numFich;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.num = num;
		this.ville = ville;
		this.codePostal = codePostal;
		this.etat = etat;
		this.sexe = sexe;
	}


	public int getNumFich() {
		return numFich;
	}


	public void setNumFich(int numFich) {
		this.numFich = numFich;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSex(String sexe) {
		this.sexe = sexe;
	}

}


