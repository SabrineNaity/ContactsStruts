package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.DAO.PhoneNumberDao;
import fr.contactsStr.DAO.implementation.PhoneNumberDaoImpl;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;


public class PhoneNumberServiceImpl implements PhoneNumberService {
	
private PhoneNumberDao PhoneNumberDao;


public PhoneNumberServiceImpl() {
	super();
	this.PhoneNumberDao= new PhoneNumberDaoImpl();
}

@Override
public PhoneNumber addPhoneNumber(PhoneNumber PhoneNumber) {
		return PhoneNumberDao.addPhoneNumber(PhoneNumber);
}

@Override
public boolean deletePhoneNumber(int id) {
	return PhoneNumberDao.deletePhoneNumber(id);
}

@Override
public boolean updatePhoneNumber(PhoneNumber PhoneNumber) {
	return PhoneNumberDao.updatePhoneNumber(PhoneNumber);
}

@Override
public PhoneNumber getPhoneNumberById(int id) {
	return PhoneNumberDao.getPhoneNumberById(id);
}

@Override
public List<PhoneNumber> findAllPhoneNumber() {
	return PhoneNumberDao.findAllPhoneNumber();
}
	


}

