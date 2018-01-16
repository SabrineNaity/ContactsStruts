package fr.contactsStr.domain;

public class PhoneNumber {
	private long id;
	private String phoneKind;
	private String phoneNumber;
	private Contact contact;
	
	
	public PhoneNumber() {
		super();
	}


	public PhoneNumber(String phoneKind, String phoneNumber, Contact contact) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
		this.contact = contact;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPhoneKind() {
		return phoneKind;
	}


	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phoneKind=" + phoneKind + ", phoneNumber=" + phoneNumber + ", contact="
				+ contact + "]";
	}
	
	

}
