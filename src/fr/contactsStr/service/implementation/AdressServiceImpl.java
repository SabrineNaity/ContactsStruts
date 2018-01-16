package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.domain.Adress;
import fr.contactsStr.service.AdressService;
import fr.contactsStr.DAO.AdressDao;
import fr.contactsStr.DAO.implementation.AdressDaoImpl;

public class AdressServiceImpl implements AdressService {
	
private AdressDao AdressDao;


public AdressServiceImpl() {
	super();
	this.AdressDao= new AdressDaoImpl();
}

@Override
public Adress addAdress(Adress Adress) {
		return AdressDao.addAdress(Adress);
}

@Override
public boolean deleteAdress(int id) {
	return AdressDao.deleteAdress(id);
}

@Override
public boolean updateAdress(Adress Adress) {
	return AdressDao.updateAdress(Adress);
}

@Override
public Adress getAdressById(int id) {
	return AdressDao.getAdressById(id);
}

@Override
public List<Adress> findAllAdress() {
	return AdressDao.findAllAdress();
}
	


}

