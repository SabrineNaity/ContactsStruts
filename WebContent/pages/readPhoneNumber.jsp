<%@page import="fr.contactsStr.domain.PhoneNumber"%>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title> Read Phone Number</title>
        <html:base/>
    </head>
    <body>
    <div class="container" action="/readPhoneNumber">

        <html:errors/>

        <% ArrayList<PhoneNumber> LPhoneNumber = (ArrayList<PhoneNumber>)request.getAttribute("LPhoneNumber");
            if(LPhoneNumber.size()==0){%> pas de telephones<br>
        <form method="post" action="/pages/moveContactBis.do">
            <input type="hidden" name="id" value="<%=(int)request.getAttribute("contactId")%>"/>
            <input type="submit" value="Ajouter un telephone">
        </form>
        <p><a href="readPhoneNumber.do"><bean:message key="label.consultationPn"/></p>
        <% }else{%>

        <table>
            <tr>
                <th>Id</th>
                <th>Marque</th>
                <th>Numero</th>
            </tr>
            <% for (PhoneNumber p : LPhoneNumber) { %>
            <tr>
                <td>

                </td>
                <td><%=p.getId()%></td>
                <td><%= p.getPhoneKind() %></td>
                <td><%= p.getPhoneNumber() %></td>
                <td>
                    <form method="post" action="/pages/deletePhoneNumber.do" >
                        <input type="hidden" name="id" value="<%=p.getId()%>"/>
                        <input type="submit" value="Delete">
                    </form>
                    <form method="post" action="/pages/movePhoneNumber.do">
                        <input type="hidden" name="id" value="<%=p.getId()%>"/>
                        <input type="submit" value="update">
                    </form>
                    </form>
                </td>
            </tr>
            <%}%>
            <form method="post" action="/pages/moveContactBis.do">
                <input type="hidden" name="id" value="<%=(int)request.getAttribute("contactId")%>"/>
                <input type="submit" value="Ajouter un telephone 2">
            </form>
            <p><a href="readPhoneNumber.do"><bean:message key="label.consultationPn"/></p>
            <%}%>

        </table>


    </div>

    </body>
</html:html>