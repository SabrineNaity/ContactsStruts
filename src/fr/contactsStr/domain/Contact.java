package fr.contactsStr.domain;

import java.util.List;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Adress adress;
	private Entreprise entreprise;
	private List<Group> groups;
	private List<PhoneNumber> phoneNumbers;
	
	public Contact() {
		super();
	}

	public Contact(String firstName, String lastName, String email, Adress adress, Entreprise entreprise,
			List<Group> groups, List<PhoneNumber> phoneNumbers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
		this.entreprise = entreprise;
		this.groups = groups;
		this.phoneNumbers = phoneNumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", adress=" + adress + ", entreprise=" + entreprise + ", groups=" + groups + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
	
	


}