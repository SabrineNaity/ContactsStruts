package fr.contactsStr.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class DeleteContactValidationForm extends ActionForm{

	private int id=(Integer)null;

	public int getId() {
	    return id;
	  }

	public void setId(int l) {
	    id=l;
	  }
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	  	this.id= (Integer)null;
  }
	public ActionErrors validate( 
		      ActionMapping mapping, HttpServletRequest request ) {
		      ActionErrors errors = new ActionErrors();
		      
		      if( getId()== (Integer)null || getId() < 0 ) {
			        errors.add("id",new ActionMessage("creation.id.error.required"));
			      }
		      return errors;
		  }
}
