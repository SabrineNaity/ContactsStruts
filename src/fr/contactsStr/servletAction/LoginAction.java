package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.contactsStr.actionForm.LoginValidationForm;

public class LoginAction extends Action {
/*
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		
		final LoginValidationForm lForm=(LoginValidationForm)pForm;
		
		final String pseudo = lForm.getPseudo();
		final String password = lForm.getPassword();

		final ContactStrDAO lDAOContact = new ContactStrDAOImpl();
		
		final String lError = lDAOContact.addContact(id, firstName, lastName, email);
		
		
		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("success");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}
	}*/

	
}
