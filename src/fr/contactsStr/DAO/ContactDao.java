package fr.contactsStr.DAO;

import java.util.List;

import fr.contactsStr.domain.Contact;

public interface ContactDao {
	public String[] toValues(Contact contact);
	public Contact toContact(String[] array);
	public Contact addContact(Contact contact);
	public boolean deleteContact(int id);
	public boolean updateContact(Contact contact);
	public Contact getContactById(int id);
	public List<Contact> findAllContact();
}
