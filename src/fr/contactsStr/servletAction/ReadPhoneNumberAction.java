package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.contactsStr.actionForm.ReadPhoneNumberValidationForm;
import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.util.List;


public class ReadPhoneNumberAction extends Action{
    public ActionForward execute(final ActionMapping pMapping,
                                 ActionForm pForm, final HttpServletRequest pRequest,
                                 final HttpServletResponse pResponse) {
        ReadPhoneNumberValidationForm lForm=(ReadPhoneNumberValidationForm)pForm;
        int contactId =lForm.getContactId();
        System.out.println("ReadPhoneNumberAction contactid : "+contactId);
        PhoneNumberService PNService = new PhoneNumberServiceImpl();
        List<PhoneNumber> LPhoneNumber = PNService.findByContactId(contactId);

        pRequest.setAttribute("LPhoneNumber", LPhoneNumber);

        return pMapping.findForward("success");

    }
}
