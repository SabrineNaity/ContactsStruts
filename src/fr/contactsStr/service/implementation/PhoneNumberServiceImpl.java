package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.DAO.PhoneNumberDao;
import fr.contactsStr.DAO.implementation.PhoneNumberDaoImpl;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;


public class PhoneNumberServiceImpl implements PhoneNumberService {
	
private PhoneNumberDao phoneNumberDao;


public PhoneNumberServiceImpl() {
	super();
	this.phoneNumberDao = new PhoneNumberDaoImpl();
}

@Override
public PhoneNumber addPhoneNumber(PhoneNumber PhoneNumber) {
		return phoneNumberDao.addPhoneNumber(PhoneNumber);
}

@Override
public boolean deletePhoneNumber(int id) {
	return phoneNumberDao.deletePhoneNumber(id);
}

@Override
public boolean updatePhoneNumber(PhoneNumber PhoneNumber) {
	return phoneNumberDao.updatePhoneNumber(PhoneNumber);
}

@Override
public PhoneNumber getPhoneNumberById(int id) {
	return phoneNumberDao.getPhoneNumberById(id);
}

@Override
public List<PhoneNumber> findByContactId(int contactId) {
	return phoneNumberDao.findByContactId(contactId);
}
	


}

