package fr.contactsStr.service.implementation;

import java.util.List;

import fr.contactsStr.DAO.GroupDao;
import fr.contactsStr.DAO.implementation.GroupDaoImpl;
import fr.contactsStr.domain.Group;
import fr.contactsStr.service.GroupService;

public class GroupServiceImpl implements GroupService {
	
private GroupDao GroupDao;


public GroupServiceImpl() {
	super();
	this.GroupDao= new GroupDaoImpl();
}

@Override
public Group addGroup(Group Group) {
		return GroupDao.addGroup(Group);
}

@Override
public boolean deleteGroup(int id) {
	return GroupDao.deleteGroup(id);
}

@Override
public boolean updateGroup(Group Group) {
	return GroupDao.updateGroup(Group);
}

@Override
public Group getGroupById(int id) {
	return GroupDao.getGroupById(id);
}

@Override
public List<Group> findAllGroup() {
	return GroupDao.findAllGroup();
}
	


}

