package fr.contactsStr.servletAction;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.contactsStr.domain.Group;
import fr.contactsStr.service.GroupService;
import fr.contactsStr.service.implementation.GroupServiceImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class ReadGroupAction extends Action{
    public ActionForward execute(final ActionMapping pMapping,
                                 ActionForm pForm, final HttpServletRequest pRequest,
                                 final HttpServletResponse pResponse) {

        GroupService GroupS = new GroupServiceImpl();
        List<Group> LGroup = GroupS.findAllGroup();

        pRequest.setAttribute("LGroup", LGroup);

        return pMapping.findForward("success");

    }
}
