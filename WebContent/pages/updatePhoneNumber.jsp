<%@page import="fr.contactsStr.domain.PhoneNumber" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Quick Update</title>
</head>
<body>


<% PhoneNumber LePhoneNumber = (PhoneNumber) request.getAttribute("LePhoneNumber");
    if (LePhoneNumber == null) {%>bug<br>
<% } else {%>
<h1>"Update Phone Number"</h1>
<html:form action="/pages/updatePhoneNumber">
    <input type="hidden" name="id" value="<%=LePhoneNumber.getId()%>">
    <p><label for="phoneKind">Type</label>

        <html:text property="phoneKind" styleId="phoneKind" value="<%=LePhoneNumber.getPhoneKind() %>"/></p>
    <p><label for="phoneNumber">Numéro</label>
        <html:text property="phoneNumber" styleId="phoneNumber" value="<%=LePhoneNumber.getPhoneNumber() %>"/></p>
    <input type="hidden" name="contactId" value="<%=LePhoneNumber.getContactId()%>">

    <input type="submit" value="modifier">


</html:form>


<%}%>


</body>
</html>