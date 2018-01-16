package fr.contactsStr.service;

import java.util.List;

import fr.contactsStr.domain.Group;

public interface GroupService {
	public Group addGroup(Group Group);
	public boolean deleteGroup(int id);
	public boolean updateGroup(Group Group);
	public Group getGroupById(int id);
	public List<Group> findAllGroup();
}

