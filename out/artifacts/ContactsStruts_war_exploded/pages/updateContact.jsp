<%@page import="fr.contactsStr.domain.Contact"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Contact LeContact =  (Contact)request.getAttribute("LeContact");
		if(LeContact==null){%>bug<br>
	<% }else{%>
		
		<html:form action="/UpdateContact">
			<input type="hidden" name="id" value="<%=LeContact.getId()%>">
			<p><label for="lastName">Nom</label>
			<!-- 
			<html:hidden property="id" styleId="id" value=""/>
			-->
    		<html:text property="lastName" styleId="lastName" value="<%=LeContact.getLastName() %>"/></p>

		    <p><label for="prenom">Prénom</label>
		    <html:text property="firstName" styleId="firstName" value="<%=LeContact.getFirstName() %>"/></p>
			
			<p><label for="email">email</label>
		    <html:text property="email" styleId="email" value="<%=LeContact.getEmail()%>"/></p>
		    
		    <input type="submit" value="modifier">
		    
		    
		    
		    
		</html:form>
		
		
	<%}%>



</body>
</html>