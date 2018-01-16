package fr.contactsStr.domain;

public class Entreprise {
	private int id;
	private String siret;
	
	public Entreprise() {
		super();
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", siret=" + siret + "]";
	}

	
	
	

}

