package fr.contactsStr.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class DeletePhoneNumberValidationForm extends ActionForm {

    private int id = 0;
    private int contactId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.id = 0;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (getId() == 0 || getId() < 0) {
            errors.add("id", new ActionMessage("creation.id.error.required"));
        }
        return errors;
    }
}
