package fr.contactsStr.service;

import java.util.List;

import fr.contactsStr.domain.Contact;

public interface ContactService {
	public Contact addContact(Contact contact);
	public boolean deleteContact(int id);
	public boolean updateContact(Contact contact);
	public Contact getContactById(int id);
	public List<Contact> findAllContact();

}

