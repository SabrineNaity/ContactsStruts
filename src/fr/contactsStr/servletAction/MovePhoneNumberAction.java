package fr.contactsStr.servletAction;

import fr.contactsStr.domain.PhoneNumber;
import fr.contactsStr.service.PhoneNumberService;
import fr.contactsStr.service.implementation.PhoneNumberServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MovePhoneNumberAction extends Action {

    public ActionForward execute(final ActionMapping pMapping,
                                 ActionForm pForm, final HttpServletRequest pRequest,
                                 final HttpServletResponse pResponse) {

        //recup id
        int id = Integer.parseInt(pRequest.getParameter("id"));

        PhoneNumberService PhoneNumberS = new PhoneNumberServiceImpl();
        PhoneNumber LPhoneNumber = PhoneNumberS.getPhoneNumberById(id);

        pRequest.setAttribute("LePhoneNumber", LPhoneNumber);

        return pMapping.findForward("success");
    }
}
