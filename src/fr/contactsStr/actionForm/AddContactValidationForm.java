package fr.contactsStr.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;


public class AddContactValidationForm extends ActionForm {
	
	private String lastName=null;
	private String firstName=null;
	private String relation=null;
	private String email=null;

	public String getLastName() {
	    return lastName;
	  }
	public String getFirstName() {
	    return firstName;
	  }
	public String getEmail() {
	    return email;
	  }

	public void setLastName(String string) {
		lastName = string;
	  }
	public void setFirstName(String string) {
	    firstName = string;
	  }
	public void setEmail(String string) {
	    email = string;
	  }
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	  	this.lastName=null;
	    this.firstName=null;
	    this.relation=null;
  }
	public ActionErrors validate(
		      ActionMapping mapping, HttpServletRequest request ) {
		      ActionErrors errors = new ActionErrors();
		      
		      if( getLastName()== null || getLastName().length() < 1 ) {
			        errors.add("nom",new ActionMessage("creation.nom.error.required"));
			      }
		      if( getFirstName()== null || getFirstName().length() < 1 ) {
		        errors.add("firstName",new ActionMessage("creation.firstName.error.required"));
		      }
		      if( getEmail() == null || getEmail().length() < 1 ) {
		        errors.add("desc", new ActionMessage("creation.desc.error.required"));
		      }
		      return errors;
		  }
}
