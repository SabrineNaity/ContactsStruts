package fr.contactsStr.servletAction;

import fr.contactsStr.actionForm.DeletePhoneNumberValidationForm;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletePhoneNumberAction extends Action {

    public ActionForward execute(ActionMapping pMapping,
                                 ActionForm pForm, HttpServletRequest pRequest,
                                 HttpServletResponse pResponse) {


        DeletePhoneNumberValidationForm lform = (DeletePhoneNumberValidationForm) pForm;

        int id = Integer.parseInt(pRequest.getParameter("id"));
        int contactId = Integer.parseInt(pRequest.getParameter("contactId"));


        System.out.println(id);
        System.out.println(contactId);

        PhoneNumberService cs = new PhoneNumberServiceImpl();
        boolean error = cs.deletePhoneNumber(id);
        System.out.println("l'erreur = : " + error);
        if (error) {
            // if no exception is raised,  forward "success"
            return pMapping.findForward("success");
        } else {
            // If any exception, return the "error" forward
            return pMapping.findForward("error");
        }
    }

}
