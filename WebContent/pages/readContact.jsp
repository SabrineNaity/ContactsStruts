<%@page import="fr.contactsStr.domain.Contact"%>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Read Contact</title>
<html:base/>
</head>
<body>
<div class="container" action="/readContact">

	<html:errors/>
	
	<% ArrayList<Contact> LContact = (ArrayList<Contact>)request.getAttribute("LContact");
  		if(LContact==null){%> pas de contact<br>
  	<% }else{%>
  	
	<table>
  <tr>
  <th>Id</th>
    <th>Nom</th>
    <th>Prenom</th> 
  </tr>
	<% for (Contact c : LContact) { %>
	<tr>
	<td>
	
	</td>
		<td><%=c.getId()%></td>
		<td><%= c.getLastName() %></td>
		<td><%= c.getFirstName() %></td>
		<td>
		<form method="post" action="/pages/deleteContact.do" >
		<input type="hidden" name="id" value="<%=c.getId()%>"/>
		<input type="submit" value="delete">
		</form>
			<form method="post" action="/pages/moveContact.do">
			<input type="hidden" name="id" value="<%=c.getId()%>"/>
			<input type="submit" value="Quick update">
		</form>
			<form method="post" action="/moveAdress.do" >
				<input type="hidden" name="id" value="<%=c.getId()%>"/>
				<input type="submit" value="Adresse">
			</form>
			<form method="post" action="/pages/readPhoneNumber.do" >
				<% System.out.println(c.getId());%>
				<input type="hidden" name="contactId" value="<%=c.getId()%>"/>
				<input type="submit" value="Telephones">
			</form>
			<form method="post" action="pages/moveGroups.do">
				<input type="hidden" name="id" value="<%=c.getId()%>"/>
				<input type="submit" value="Ajouter a un groupe">
			</form>
			</form>
		</td>
	</tr>
	<%}}%>
	
</table>

</div>

</body>
</html:html>