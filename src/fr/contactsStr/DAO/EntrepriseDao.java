package fr.contactsStr.DAO;

import java.util.List;

import fr.contactsStr.domain.Entreprise;

public interface EntrepriseDao {
	public String[] toValues(Entreprise Entreprise);
	public Entreprise toEntreprise(String[] array);
    public Entreprise addEntreprise(Entreprise entreprise);
    public boolean deleteEntreprise(int id);
    public boolean updateEntreprise(Entreprise entreprise);
    public Entreprise getEntrepriseById(int id);
    public List<Entreprise> findAllEntreprise();
}
