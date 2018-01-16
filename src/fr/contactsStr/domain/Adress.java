package fr.contactsStr.domain;

public class Adress {
	private int id;
	private String street;
	private String zip;
	private String country;
	
	
	public Adress() {
		super();
	}
	
	
	public Adress(String street, String zip, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.country = country;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Adress [id=" + id + ", street=" + street + ", zip=" + zip + ", country=" + country + "]";
	}



}
