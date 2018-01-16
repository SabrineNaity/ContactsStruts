package fr.contactsStr.DAO.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.contactsStr.DAO.AdressDao;
import fr.contactsStr.DAO.ContactDao;
import fr.contactsStr.DAO.EntrepriseDao;
import fr.contactsStr.domain.Adress;
import fr.contactsStr.domain.Contact;
import fr.contactsStr.domain.Entreprise;


public class ContactDaoImpl implements ContactDao {

	private String[] fields;
	private final static String TABLE = "contact" ;

	private GenericDao genericDao;
	private AdressDao adressDao;
	private EntrepriseDao entrepriseDao;
	
	
	public ContactDaoImpl() {
		super();
		this.fields = new String[] {"firstName", "lastName","email","adress","entreprise"};
		this.genericDao= new GenericDao();
		}
	
	
	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public GenericDao getGenericDao() {
		return genericDao;
	}

	public void setGenericDao(GenericDao genericDao) {
		this.genericDao = genericDao;
	}

	public static String getTable() {
		return TABLE;
	}


	
	public String[] toValues(Contact contact) {
		String[] values = new String[5];
		values[0] = contact.getFirstName();
		values[1] = contact.getLastName();
		values[2] = contact.getEmail();
		values[3] = contact.getLastName();
		values[4] = contact.getLastName();
		return values;
	}
	
	public Contact toContact(String[] array) {
		Contact contact = new Contact();
		contact.setId(Integer.parseInt(array[0]));
		contact.setFirstName(array[1]);
		contact.setLastName(array[2]);
		contact.setEmail(array[3]);
		/*
		int adressId = Integer.parseInt(array[3]);
		Adress adress = adressDao.getAdressById(adressId);
		contact.setAdress(adress);
		int entrepriseId = Integer.parseInt(array[4]);
		Entreprise entreprise = entrepriseDao.getEntrepriseById(entrepriseId);
		contact.setEntreprise(entreprise);
		*/
		return contact;
	}

	@Override
	public Contact addContact(Contact contact) {
		try {
			String[] values = toValues(contact);
			int id =  genericDao.insert(TABLE, fields, values);
			contact.setId(id);
			return contact;
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Contact> findAllContact() {
		List<Contact> contacts = new ArrayList<Contact>();

		String[] fields2=new String[] {"id","firstName", "lastName","email","adress","entreprise"};
		try{
		List<String[]> resrequest = genericDao.findAll(TABLE,fields2);
		for(String []elt: resrequest){
			 contacts.add(toContact(elt));
		}
		return contacts;
		}catch (Exception e) {
			throw new RuntimeException(e);		
		}
	}
	
	@Override
	public boolean updateContact(Contact contact) {
		Contact res = new Contact();
		String[] resrequest = null;
		try{
			return genericDao.update(TABLE, contact.getId()+"", fields, toValues(contact));
			/*
			res = toContact(resrequest);
			return res ;
			*/
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}

	@Override
	public boolean deleteContact(int id) {
		try {
			return genericDao.delete(TABLE, id+"");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Contact getContactById(int id) {
		Contact res= new Contact();
		String[] resrequest = null;
		String[] fields2=new String[] {"id","firstName", "lastName","email","adress","entreprise"};
		try {
			resrequest = genericDao.findById(TABLE,fields2, id+"");
			res= toContact(resrequest);
			return res;
		}catch (Exception e) {
			throw new RuntimeException(e);
	}
	}

}

