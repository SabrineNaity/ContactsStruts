package fr.contactsStr.service;

import java.util.List;

import fr.contactsStr.domain.Adress;

public interface AdressService {
	public Adress addAdress(Adress Adress);
	public boolean deleteAdress(int id);
	public boolean updateAdress(Adress Adress);
	public Adress getAdressById(int id);
	public List<Adress> findAllAdress();

}

