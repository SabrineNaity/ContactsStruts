package fr.contactsStr.servletAction;

import fr.contactsStr.actionForm.UpdatePhoneNumberValidationForm;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdatePhoneNumberAction extends Action {
    public ActionForward execute(ActionMapping pMapping,
                                 ActionForm pForm, HttpServletRequest pRequest,
                                 HttpServletResponse pResponse) {

        UpdatePhoneNumberValidationForm lForm = (UpdatePhoneNumberValidationForm) pForm;

        PhoneNumber c = new PhoneNumber();
        c.setId(lForm.getId());
        System.out.println(lForm.getId());
        c.setPhoneNumber(lForm.getPhoneNumber());
        c.setPhoneKind(lForm.getPhoneKind());
        PhoneNumberService cs = new PhoneNumberServiceImpl();
        boolean update = cs.updatePhoneNumber(c);


        if (update == true) {
            // if no exception is raised,  forward "success"
            return pMapping.findForward("success");
        } else {
            // If any exception, return the "error" forward
            return pMapping.findForward("error");
        }


    }
}
