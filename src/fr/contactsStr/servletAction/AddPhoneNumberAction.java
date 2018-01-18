package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.contactsStr.actionForm.AddPhoneNumberValidationForm;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class AddPhoneNumberAction extends Action{

    public ActionForward execute( ActionMapping pMapping,
                                  ActionForm pForm,  HttpServletRequest pRequest,
                                  HttpServletResponse pResponse) {

        AddPhoneNumberValidationForm lForm=(AddPhoneNumberValidationForm)pForm;

        PhoneNumber c = new PhoneNumber();
        c.setPhoneNumber(lForm.getPhoneNumber());
        PhoneNumberService cs = new PhoneNumberServiceImpl();
        cs.addPhoneNumber(c);


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
