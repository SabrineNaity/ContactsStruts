package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.contactsStr.actionForm.AddContactValidationForm;
import fr.contactsStr.domain.Contact;
import fr.contactsStr.domain.ContactsStr;
import fr.contactsStr.service.ContactService;
import fr.contactsStr.service.implementation.ContactServiceImpl;

public class AddContactAction extends Action{
	
	public ActionForward execute( ActionMapping pMapping,
			ActionForm pForm,  HttpServletRequest pRequest,
			HttpServletResponse pResponse) {
		
		 AddContactValidationForm lForm=(AddContactValidationForm)pForm;
		
		Contact c = new Contact();
		c.setLastName(lForm.getLastName());
		c.setFirstName(lForm.getFirstName());
		c.setEmail(lForm.getEmail());
		ContactService cs = new ContactServiceImpl();
		cs.addContact(c);
		
		
		if(c.getId() != 0) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("success");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}
	}

	
}
