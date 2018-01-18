<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add Contact</title>
<html:base/>
</head>
<body>
<h1> Page de Création de contact</h1>
<div class="container">
  <html:form action="/addContact" >
	<html:errors/>
    <p><label for="lastName">Nom</label>
    <html:text property="lastName" styleId="lastName"/></p>

    <p><label for="firstName">Prénom</label>
    <html:text property="firstName" styleId="firstName"/></p>
	
	<p><label for="email">email</label>
    <html:text property="email" styleId="email"/></p>


	

    <p><input type="submit" value="Submit"></p>

  </html:form>
</div>

</body>
</html:html>