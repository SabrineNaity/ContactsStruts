package fr.contactsStr.domain;

public class ContactsStr {
	private String nom;
	private String prenom;
	private int id;
	private String relation;
	private String desc;
	
	
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ContactsStr(int id,String nom, String prenom, String relation, String desc) {
		super();
		this.id=id;
		this.nom = nom;
		this.prenom = prenom;
		this.relation = relation;
		this.desc = desc;
	}
	
	public ContactsStr(String nom, String prenom, String relation, String desc) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.relation = relation;
		this.desc = desc;
	}

	public ContactsStr(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	public ContactsStr(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public ContactsStr() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", relation=" + relation + ", desc=" + desc
				+ "]";
	}*/
	
}
