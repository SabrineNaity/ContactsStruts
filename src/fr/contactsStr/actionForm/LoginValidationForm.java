package fr.contactsStr.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class LoginValidationForm extends ActionForm {
	
	private String pseudo;
	private String password;
	
	public String getPseudo(){
		return pseudo;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPseudo(String pseudo){
		this.pseudo=pseudo;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public ActionErrors Validate(ActionMapping m, HttpServletRequest r){
		ActionErrors errors = new ActionErrors();
		if(pseudo==null || pseudo.length()<1){
			errors.add("pseudo", new ActionMessage("error.username.required"));
		}
		if(password==null || password.length()<1){
			errors.add("password", new ActionMessage("error.password.required"));
		}
		return errors;
	}
}
