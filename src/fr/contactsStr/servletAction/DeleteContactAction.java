package fr.contactsStr.servletAction;

import fr.contactsStr.actionForm.DeleteContactValidationForm;
import fr.contactsStr.service.ContactService;
import fr.contactsStr.service.implementation.ContactServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteContactAction extends Action{

	public ActionForward execute( ActionMapping pMapping,
			ActionForm pForm,  HttpServletRequest pRequest,
			HttpServletResponse pResponse) {
		
		 
		 DeleteContactValidationForm lform = (DeleteContactValidationForm)pForm;

		 int id = Integer.parseInt(pRequest.getParameter("id"));

			System.out.println(id);

        ContactService cs = new ContactServiceImpl();
		 boolean error = cs.deleteContact(id);
		 System.out.println("l'erreur = : "+error);
		if(error) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("success");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}
	}
	
}
