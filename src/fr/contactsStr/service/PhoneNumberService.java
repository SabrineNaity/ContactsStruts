package fr.contactsStr.service;

import java.util.List;

import fr.contactsStr.domain.PhoneNumber;

public interface PhoneNumberService {
	public PhoneNumber addPhoneNumber(PhoneNumber PhoneNumber);
	public boolean deletePhoneNumber(int id);
	public boolean updatePhoneNumber(PhoneNumber PhoneNumber);
	public PhoneNumber getPhoneNumberById(int id);
	public List<PhoneNumber> findAllPhoneNumber();
}

