package fr.contactsStr.DAO;

import java.util.List;

import fr.contactsStr.domain.Group;

public interface GroupDao {
	public String[] toValues(Group Group);
	public Group toGroup(String[] array);
	public Group addGroup(Group Group);
	public boolean deleteGroup(int id);
	public boolean updateGroup(Group Group);
	public Group getGroupById(int id);
	public List<Group> findAllGroup();
}
