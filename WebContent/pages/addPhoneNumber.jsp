<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="fr.contactsStr.domain.Contact" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title> Add Phone Number</title>
        <html:base/>
    </head>
    <body>
    <% Contact LeContact = (Contact) request.getAttribute("LeContact");

        System.out.println(LeContact);
        if (LeContact == null) { %>bug de addphone Number<br>
    <% } else {%>
    <h1> Page de Création de Téléphone</h1>
    <div class="container">
        <html:form action="/pages/addPhoneNumber" >
            <html:errors/>
            <p><label for="phoneKind">Type</label>
                <html:text property="phoneKind" styleId="phoneKind"/></p>

            <p><label for="phoneNumber">Numéro de téléphone</label>
                <html:text property="phoneNumber" styleId="phoneNumber"/></p>

            <input type="hidden" name="contactId" value="<%=LeContact.getId()%>"/>

            <p><input type="submit" value="Submit"></p>

        </html:form>
    </div>

    </body>
</html>
<%}%>


</body>
</html>