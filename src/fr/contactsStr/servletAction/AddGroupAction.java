package fr.contactsStr.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.contactsStr.actionForm.AddGroupValidationForm;
import fr.contactsStr.domain.Group;
import fr.contactsStr.service.GroupService;
import fr.contactsStr.service.implementation.GroupServiceImpl;


public class AddGroupAction extends Action{
	
	public ActionForward execute( ActionMapping pMapping,ActionForm pForm,HttpServletRequest pRequest,HttpServletResponse pResponse) {
		AddGroupValidationForm lForm=(AddGroupValidationForm)pForm;
		Group g = new Group();
		g.setGroupName(lForm.getGroupName());
		GroupService gs = new GroupServiceImpl();
		gs.addGroup(g);
		if(g.getId()!= 0) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("success");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}
	}

	}
		



