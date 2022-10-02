package oo;


public class Consultation {
	int numConsultation;
	String dateConsultation;
	String type;
	String remarque;
	int numFich;
	
	public Consultation(int numConsultation, String dateConsultatuon, String type, String remarque, int numFich) {
		super();
		this.numConsultation = numConsultation;
		this.dateConsultation = dateConsultatuon;
		this.type = type;
		this.remarque = remarque;
		this.numFich = numFich;
	}

	public int getNumConsultation() {
		return numConsultation;
	}

	public void setNumConsultation(int numConsultation) {
		this.numConsultation = numConsultation;
	}

	public String getDateConsultation() {
		return dateConsultation;
	}

	public void setDateConsultation(String dateConsultatuon) {
		this.dateConsultation = dateConsultatuon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public int getNumFich() {
		return numFich;
	}

	public void setNumFich(int numFich) {
		this.numFich = numFich;
	}
	
}
