package fr.contactsStr.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class UpdatePhoneNumberValidationForm extends ActionForm {

    private int id = 0;
    private String phoneKind = null;
    private String phoneNumber = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneKind() {
        return phoneKind;
    }

    public void setPhoneKind(String phoneKind) {
        this.phoneKind = phoneKind;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.phoneKind = null;
        this.phoneNumber = null;
    }

    public ActionErrors validate(
            ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (getPhoneNumber() == null || getPhoneNumber().length() < 10) {
            errors.add("phoneNumber", new ActionMessage("creation.phoneNumber.error.required"));
        }
        return errors;
    }


}
