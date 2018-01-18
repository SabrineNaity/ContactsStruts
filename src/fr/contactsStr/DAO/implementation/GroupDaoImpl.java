package fr.contactsStr.DAO.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.contactsStr.DAO.GroupDao;
import fr.contactsStr.domain.Group;

public class GroupDaoImpl implements GroupDao {

	String[] fields = { "groupName"};
	private final static String TABLE = "groupe";

	private GenericDao genericDao;

	public String[] toValues(Group Group) {
		String[] values = new String[1];
		values[0] = Group.getGroupName();
		return values;
	}
	
	public Group toGroup(String[] array) {
		Group Group = new Group();
		Group.setGroupName(array[0]);
		return Group;
	}

	@Override
	public Group addGroup(Group Group) {
		try {
			String[] values = toValues(Group);
			int id = genericDao.insert(TABLE, fields, values);
			Group.setId(id);
			return Group;
			
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Group> findAllGroup() {
		List<Group> Groups = new ArrayList<Group>();
		try{
		List<String[]> resrequest = genericDao.findAll(TABLE,fields);
		for(String []elt: resrequest){
			 Groups.add(toGroup(elt));
			 
			 }
		return Groups;
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}
	@Override
	public boolean updateGroup(Group Group) {
		Group res = new Group();
		String[] resrequest = null;
		try{
			return genericDao.update(TABLE, Group.getId()+"", fields, toValues(Group));
			/*
			res = toGroup(resrequest);
			return res ;
			*/
		}catch (Exception e) {
			throw new RuntimeException(e);		
			}
	}

	@Override
	public boolean deleteGroup(int id) {
		try {
			return genericDao.delete(TABLE, id+"");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Group getGroupById(int id) {
		Group res= new Group();
		String[] resrequest = null;
		String[] fields2=null;
		try {
			resrequest = genericDao.findById(TABLE,fields2, id+"");
			res= toGroup(resrequest);
			return res;
		}catch (Exception e) {
			throw new RuntimeException(e);
	}
	}

}

