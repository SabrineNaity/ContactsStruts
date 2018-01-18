<%@page import="java.util.ArrayList"%>
<%@page import="fr.contactsStr.domain.Group"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title> Read Group</title>
        <html:base/>
    </head>
    <body>
    <div class="container" action="/readGroup">

        <html:errors/>

        <% ArrayList<Group> LGroup = (ArrayList<Group>)request.getAttribute("LGroup");
            if(LGroup==null){%> pas de groups <br>
        <% }else{%>

        <table>
            <tr>
                <th>Nom du groupe</th>
            </tr>
            <% for (Group c : LGroup) { %>
            <tr>
                <td>

                </td>
                <td><%=c.getId()%></td>
                <td><%= c.getGroupName() %></td>
                <td>
                    <form method="post" action="/pages/deleteContact.do" >
                        <input type="hidden" name="id" value="<%=c.getId()%>"/>
                        <input type="submit" value="delete">
                    </form>

                    <form method="post" action="/ContactsStr/MoveContact.do" >
                        <input type="hidden" name="id" value="<%=c.getId()%>"/>
                        <input type="submit" value="update">
                    </form>
                </td>
            </tr>
            <%}}%>

        </table>

    </div>

    </body>
</html:html>