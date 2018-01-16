package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.contactsStr.domain.Contact;
import fr.contactsStr.service.ContactService;
import fr.contactsStr.service.implementation.ContactServiceImpl;

public class MoveContactAction extends Action {

	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		
		//recup id
			 int id = Integer.parseInt(pRequest.getParameter("id"));
		
			 ContactService ContactS = new ContactServiceImpl();
			Contact LContact = ContactS.getContactById(id);
				
			pRequest.setAttribute("LeContact", LContact);
		
			return pMapping.findForward("success");
	}
}
