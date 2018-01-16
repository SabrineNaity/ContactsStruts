package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.DAO.EntrepriseDao;
import fr.contactsStr.DAO.implementation.EntrepriseDaoImpl;
import fr.contactsStr.domain.Entreprise;
import fr.contactsStr.service.EntrepriseService;

public class EntrepriseServiceImpl implements EntrepriseService {
	
private EntrepriseDao EntrepriseDao;


public EntrepriseServiceImpl() {
	super();
	this.EntrepriseDao= new EntrepriseDaoImpl();
}

@Override
public Entreprise addEntreprise(Entreprise Entreprise) {
		return EntrepriseDao.addEntreprise(Entreprise);
}

@Override
public boolean deleteEntreprise(int id) {
	return EntrepriseDao.deleteEntreprise(id);
}

@Override
public boolean updateEntreprise(Entreprise Entreprise) {
	return EntrepriseDao.updateEntreprise(Entreprise);
}

@Override
public Entreprise getEntrepriseById(int id) {
	return EntrepriseDao.getEntrepriseById(id);
}

@Override
public List<Entreprise> findAllEntreprise() {
	return EntrepriseDao.findAllEntreprise();
}
	


}
