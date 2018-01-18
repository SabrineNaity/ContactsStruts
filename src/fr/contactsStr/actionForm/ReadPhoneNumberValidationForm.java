package fr.contactsStr.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class ReadPhoneNumberValidationForm extends ActionForm {
    private int contactId = 0;

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    public int getContactId() {

        return contactId;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.contactId = 0;
    }
    public ActionErrors validate(
            ActionMapping mapping, HttpServletRequest request ) {
        ActionErrors errors = new ActionErrors();

        if( getContactId()== 0) {
            errors.add("contactID",new ActionMessage("contact.id.error.required"));
        }
        return errors;
    }
}
