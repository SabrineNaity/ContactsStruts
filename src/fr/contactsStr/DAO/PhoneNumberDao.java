package fr.contactsStr.DAO;

import java.util.List;

import fr.contactsStr.domain.PhoneNumber;

public interface PhoneNumberDao {
	public String[] toValues(PhoneNumber PhoneNumber);
	public PhoneNumber toPhoneNumber(String[] array);
	public PhoneNumber addPhoneNumber(PhoneNumber PhoneNumber);
	public boolean deletePhoneNumber(int id);
	public boolean updatePhoneNumber(PhoneNumber PhoneNumber);
	public PhoneNumber getPhoneNumberById(int id);
	public List<PhoneNumber> findAllPhoneNumber();
}
