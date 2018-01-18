package fr.contactsStr.servletAction;

import fr.contactsStr.actionForm.AddPhoneNumberValidationForm;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddPhoneNumberAction extends Action{

    public ActionForward execute( ActionMapping pMapping,
                                  ActionForm pForm,  HttpServletRequest pRequest,
                                  HttpServletResponse pResponse) {

        AddPhoneNumberValidationForm lForm=(AddPhoneNumberValidationForm)pForm;

        PhoneNumber c = new PhoneNumber();
        c.setPhoneKind(lForm.getPhoneKind());
        c.setPhoneNumber(lForm.getPhoneNumber());
        c.setcontactId(lForm.getContactId());
        System.out.println("test4");

        PhoneNumberService cs = new PhoneNumberServiceImpl();
        cs.addPhoneNumber(c);
        System.out.println("test5");


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
