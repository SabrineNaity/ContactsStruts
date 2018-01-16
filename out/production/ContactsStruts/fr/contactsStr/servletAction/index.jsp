<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html:html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<html:base/>
</head>
<body>

<p>Identification</p>
<html:form action="/index">
<html:errors/>
<label for="pseudo">Identifiant :</label>
   <input type="text" name="pseudo" /><br>
   <label for="password">Mot de passe :</label>
   <input type="password" name="password"/>
   <input type="submit" value="Submit">
</html:form>
<html:errors/>
</body>
</html:html>


