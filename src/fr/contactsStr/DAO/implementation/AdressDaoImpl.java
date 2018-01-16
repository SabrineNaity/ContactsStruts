package fr.contactsStr.DAO.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.contactsStr.DAO.AdressDao;
import fr.contactsStr.domain.Adress;


public class AdressDaoImpl implements AdressDao {

	String[] fields = {"street", "zip", "country"};
	private final static String TABLE = "Adress";

	private GenericDao genericDao;

	public String[] toValues(Adress Adress) {
		String[] values = new String[3];
		values[0] = Adress.getStreet();
		values[1] = Adress.getZip();
		values[2] = Adress.getCountry();
		return values;
	}
	
	public Adress toAdress(String[] array) {
		Adress Adress = new Adress();
		Adress.setStreet(array[0]);
		Adress.setZip(array[1]);
		Adress.setCountry(array[2]);
		return Adress;
	}

	@Override
	public Adress addAdress(Adress Adress) {
		try {
			String[] values = toValues(Adress);
			int id =  genericDao.insert(TABLE, fields, values);
			 Adress.setId(id);
			 return Adress;
			
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Adress> findAllAdress() {
		List<Adress> Adresss = new ArrayList<Adress>();
		try{
		List<String[]> resrequest = genericDao.findAll(TABLE,fields);
		for(String []elt: resrequest){
			 Adresss.add(toAdress(elt));			 
			 }
		return Adresss;
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}
	@Override
	public boolean updateAdress(Adress Adress) {
		Adress res = new Adress();
		String[] resrequest = null;
		try{
			return genericDao.update(TABLE, Adress.getId()+"", fields, toValues(Adress));
			/*
			res = toAdress(resrequest);
			return res ;
			*/
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}

	@Override
	public boolean deleteAdress(int id) {
		try {
			return genericDao.delete(TABLE, id+"");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Adress getAdressById(int id) {
		Adress res= new Adress();
		String[] resrequest = null;
		String[] fields2=null;
		try {
			resrequest = genericDao.findById(TABLE,fields2, id+"");
			res= toAdress(resrequest);
			return res;
		}catch (Exception e) {
			throw new RuntimeException(e);
	}
	}

}

