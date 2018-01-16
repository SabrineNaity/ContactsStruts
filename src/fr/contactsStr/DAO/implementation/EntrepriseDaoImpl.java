package fr.contactsStr.DAO.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.contactsStr.DAO.EntrepriseDao;
import fr.contactsStr.domain.Entreprise;

public class EntrepriseDaoImpl implements EntrepriseDao {

	String[] fields = { "EntrepriseName"};
	private final static String TABLE = "Entreprise";

	private GenericDao genericDao;

	public String[] toValues(Entreprise Entreprise) {
		String[] values = new String[1];
		values[0] = Entreprise.getSiret();
		return values;
	}
	
	public Entreprise toEntreprise(String[] array) {
		Entreprise Entreprise = new Entreprise();
		Entreprise.setSiret(array[0]);
		return Entreprise;
	}

	@Override
	public Entreprise addEntreprise(Entreprise Entreprise) {
		try {
			String[] values = toValues(Entreprise);
			int id =  genericDao.insert(TABLE, fields, values);
			Entreprise.setId(id);
			return Entreprise;
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Entreprise> findAllEntreprise() {
		List<Entreprise> Entreprises = new ArrayList<Entreprise>();
		try{
		List<String[]> resrequest = genericDao.findAll(TABLE,fields);
		for(String []elt: resrequest){
			 Entreprises.add(toEntreprise(elt));
			 
			 }
		return Entreprises;
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}
	@Override
	public boolean updateEntreprise(Entreprise Entreprise) {
		Entreprise res = new Entreprise();
		String[] resrequest = null;
		try{
			return genericDao.update(TABLE, Entreprise.getId()+"", fields, toValues(Entreprise));
			/*
			res = toEntreprise(resrequest);
			return res ;
			*/
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}

	@Override
	public boolean deleteEntreprise(int id) {
		try {
			return genericDao.delete(TABLE, id+"");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Entreprise getEntrepriseById(int id) {
		Entreprise res= new Entreprise();
		String[] resrequest = null;
		String[] fields2=null;
		try {
			resrequest = genericDao.findById(TABLE,fields2, id+"");
			res= toEntreprise(resrequest);
			return res;
		}catch (Exception e) {
			throw new RuntimeException(e);
	}
	}

}

