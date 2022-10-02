package oo;

public class Ordonnance {
	int numOrdonnance;
	int numConsultation;
	
	
	public Ordonnance(int numOrdonnance, int numConsultation) {
		super();
		this.numOrdonnance = numOrdonnance;
		this.numConsultation = numConsultation;
	}


	public int getNumOrdonnance() {
		return numOrdonnance;
	}


	public void setNumOrdonnance(int numOrdonnance) {
		this.numOrdonnance = numOrdonnance;
	}


	public int getNumConsultation() {
		return numConsultation;
	}


	public void setNumConsultation(int numConsultation) {
		this.numConsultation = numConsultation;
	}
	
	
}
