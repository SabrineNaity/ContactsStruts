package fr.contactsStr.DAO;

import java.util.List;

import fr.contactsStr.domain.Adress;

public interface AdressDao {
	public String[] toValues(Adress Adress);
	public Adress toAdress(String[] array);
	public Adress addAdress(Adress Adress);
	public boolean deleteAdress(int id);
	public boolean updateAdress(Adress Adress);
	public Adress getAdressById(int id);
	public List<Adress> findAllAdress();
}
