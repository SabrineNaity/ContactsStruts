package fr.contactsStr.actionForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;


public class AddPhoneNumberValidationForm extends ActionForm {

    private String phoneKind=null;
    private String phoneNumber=null;
    private int contactId = 0;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
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
        this.phoneKind=null;
        this.phoneNumber=null;
        this.contactId = 0;
    }
    public ActionErrors validate(
            ActionMapping mapping, HttpServletRequest request ) {
        ActionErrors errors = new ActionErrors();

        if( getPhoneNumber()== null || getPhoneNumber().length() < 1 ) {
            System.out.println("phone error");
            errors.add("phoneNumber",new ActionMessage("creation.phoneNumber.error.required"));
        }
        if (getContactId() == 0) {
            System.out.println("contactId error");
            errors.add("contactId", new ActionMessage("creation.contactId.error.required"));
        } else {
            System.out.println("phone success");
        }

        return errors;
    }
}
