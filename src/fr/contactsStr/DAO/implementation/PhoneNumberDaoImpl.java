package fr.contactsStr.DAO.implementation;

import fr.contactsStr.DAO.ContactDao;
import fr.contactsStr.DAO.PhoneNumberDao;
import fr.contactsStr.domain.Contact;
import fr.contactsStr.domain.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberDaoImpl implements PhoneNumberDao {


	String[] fields = {"id", "phoneKind", "phoneNumber", "contact"};
	private final static String TABLE = "phonenumber";

	private GenericDao genericDao;
	private ContactDao contactDao;

	public PhoneNumberDaoImpl(){
		this.genericDao= new GenericDao();
		this.contactDao= new ContactDaoImpl();
	}

	public String[] toValues(PhoneNumber PhoneNumber) {
		String[] values = new String[3];
		values[0] = PhoneNumber.getPhoneKind();
		values[1] = PhoneNumber.getPhoneNumber();
		values[2] = PhoneNumber.getContactId()+"";
		return values;
	}
	
	public PhoneNumber toPhoneNumber(String[] array) {
		PhoneNumber PhoneNumber = new PhoneNumber();
		int id = Integer.parseInt(array[0]);
		PhoneNumber.setId(id);
		PhoneNumber.setPhoneKind(array[1]);
		PhoneNumber.setPhoneNumber(array[2]);
		int idContact = Integer.parseInt(array[3]);
		Contact contact = contactDao.getContactById(idContact);
		PhoneNumber.setcontactId(contact.getId());
		return PhoneNumber;
	}

	@Override
	public PhoneNumber addPhoneNumber(PhoneNumber PhoneNumber) {
		try {
			System.out.println("test1");
			String[] values = toValues(PhoneNumber);
			int id= genericDao.insert(TABLE, fields, values);
			System.out.println("test2");
			PhoneNumber.setId(id);
			System.out.println("test3");
			return PhoneNumber;
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<PhoneNumber> findByContactId(int contactId) {
		List<PhoneNumber> PhoneNumbers = new ArrayList<PhoneNumber>();
		try{
		List<String[]> resrequest = genericDao.findByAttribute(TABLE,fields,"contact",contactId+"");
		for(String []elt: resrequest){
			 PhoneNumbers.add(toPhoneNumber(elt));
			 
			 }
		return PhoneNumbers;
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}
	@Override
	public boolean updatePhoneNumber(PhoneNumber PhoneNumber) {
		PhoneNumber res = new PhoneNumber();
		String[] resrequest = null;
		try{
			return genericDao.update(TABLE, PhoneNumber.getId()+"", fields, toValues(PhoneNumber));
			/*
			res = toPhoneNumber(resrequest);
			return res ;
			*/
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}

	@Override
	public boolean deletePhoneNumber(int id) {
		try {
			return genericDao.delete(TABLE, id+"");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public PhoneNumber getPhoneNumberById(int id) {
		PhoneNumber res= new PhoneNumber();
		String[] resrequest = null;

		try {
			resrequest = genericDao.findById(TABLE, fields, id + "");
			res= toPhoneNumber(resrequest);
			return res;
		}catch (Exception e) {
			throw new RuntimeException(e);
	}
	}

}

