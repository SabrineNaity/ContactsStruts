package fr.contactsStr.service;

import java.util.List;

import fr.contactsStr.domain.Entreprise;


public interface EntrepriseService {
	public Entreprise addEntreprise(Entreprise Entreprise);
	public boolean deleteEntreprise(int id);
	public boolean updateEntreprise(Entreprise Entreprise);
	public Entreprise getEntrepriseById(int id);
	public List<Entreprise> findAllEntreprise();

}

