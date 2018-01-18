<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title> Add Phone Number</title>
        <html:base/>
    </head>
    <body>
    <h1> Page de Création de Téléphone</h1>
    <div class="container">
        <html:form action="/pages/addPhoneNumber" >
            <html:errors/>
            <p><label for="phoneKind">Type</label>
                <html:text property="phoneKind" styleId="phoneKind"/></p>

            <p><label for="phoneNumber">Numéro de téléphone</label>
                <html:text property="phoneNumber" styleId="phoneNumber"/></p>

            <p><input type="submit" value="Submit"></p>

        </html:form>
    </div>

    </body>
</html:html>