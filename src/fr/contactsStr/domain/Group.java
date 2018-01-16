package fr.contactsStr.domain;

import java.util.List;

public class Group {
	private int id;
	private String groupName;
	private List<Contact> contacts;
	
	public Group() {
		super();
	}

	public Group(int id, String groupName, List<Contact> contacts) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "ContactGroup [id=" + id + ", groupName=" + groupName + ", contacts=" + contacts + "]";
	}
	
	
	

}

