package fr.contactsStr.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddGroupValidationForm extends ActionForm{


	private String groupName;

	public AddGroupValidationForm() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getGroupName() == null || getGroupName().length() < 1) {
		errors.add("groupName", new ActionMessage("error.groupName.required"));
		// TODO: add 'error.name.required' key to your resources
		}
		return errors;
		}
}
