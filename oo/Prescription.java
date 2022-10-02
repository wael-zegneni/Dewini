package oo;

public class Prescription {
	int numOrdonnance;
	int numMedicament;
	int nbFois;
	int nbBoites;
	
	public Prescription(int numOrdonnance, int numMedicament, int nbFois, int nbBoites) {
		super();
		this.numOrdonnance = numOrdonnance;
		this.numMedicament = numMedicament;
		this.nbFois = nbFois;
		this.nbBoites = nbBoites;
	}

	public int getNumOrdonnance() {
		return numOrdonnance;
	}

	public void setNumOrdonnance(int numOrdonnance) {
		this.numOrdonnance = numOrdonnance;
	}

	public int getNumMedicament() {
		return numMedicament;
	}

	public void setNumMedicament(int numMedicament) {
		this.numMedicament = numMedicament;
	}

	public int getNbFois() {
		return nbFois;
	}

	public void setNbFois(int nbFois) {
		this.nbFois = nbFois;
	}

	public int getNbBoites() {
		return nbBoites;
	}

	public void setNbBoites(int nbBoites) {
		this.nbBoites = nbBoites;
	}
	
	
	
}
