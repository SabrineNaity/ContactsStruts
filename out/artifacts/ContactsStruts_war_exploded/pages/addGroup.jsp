<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add Group</title>
<html:base/>
</head>
<body>
<h1> Page de création du groupe</h1>
<div class="container">
   <html:form action="/addGroup" >
	<html:errors/>
    <p><label for="groupName">Nom du groupe</label>
    <input type="text"  name="groupName" placeholder="Nom du groupe"></p>    
    <p><input type="submit" value="Submit"></p> 
    </form>

  </html:form>
</div>

</body>
</html:html>