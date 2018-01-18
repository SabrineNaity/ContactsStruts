package fr.contactsStr.domain;

public class PhoneNumber {
	private int id;
	private String phoneKind;
	private String phoneNumber;
	private int contactId;
	
	
	public PhoneNumber() {
		super();
	}


	public PhoneNumber(String phoneKind, String phoneNumber, int contact) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
		this.contactId = contact;
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
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


	public int getContactId() {
		return contactId;
	}


	public void setcontactId(int contact) {
		this.contactId = contact;
	}


	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phoneKind=" + phoneKind + ", phoneNumber=" + phoneNumber + ", contact="
				+ contactId + "]";
	}
	
	

}
