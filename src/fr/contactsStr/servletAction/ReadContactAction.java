package fr.contactsStr.servletAction;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.contactsStr.domain.Contact;
import fr.contactsStr.domain.ContactsStr;
import fr.contactsStr.service.ContactService;
import fr.contactsStr.service.implementation.ContactServiceImpl;

public class ReadContactAction extends Action{
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		//List<ContactsStr> LContact = new ArrayList<ContactsStr>();
		 
		
		ContactService ContactS = new ContactServiceImpl();
		List<Contact> LContact = ContactS.findAllContact();
		
		pRequest.setAttribute("LContact", LContact);

		return pMapping.findForward("success");
		
	}
}
