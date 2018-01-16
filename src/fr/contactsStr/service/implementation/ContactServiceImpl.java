package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.DAO.implementation.ContactDaoImpl;
import fr.contactsStr.domain.Contact;
import fr.contactsStr.service.ContactService;



public class ContactServiceImpl implements ContactService {
	
	private ContactDaoImpl contactDao;


public ContactServiceImpl() {
	super();
	this.contactDao= new ContactDaoImpl();
}

@Override
public Contact addContact(Contact contact) {
		return contactDao.addContact(contact);
}

@Override
public boolean deleteContact(int id) {
	return contactDao.deleteContact(id);
}

@Override
public boolean updateContact(Contact contact) {
	return contactDao.updateContact(contact);
}

@Override
public Contact getContactById(int id) {
	return contactDao.getContactById(id);
}

@Override
public List<Contact> findAllContact() {
	return contactDao.findAllContact();
}
	


}

