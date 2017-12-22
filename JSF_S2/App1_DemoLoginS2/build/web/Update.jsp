<%-- 
    Document   : Update
    Created on : Dec 22, 2017, 12:46:56 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book!</h1>
        <s:form action="doUpdate" method="POST" >
            <s:textfield label="Book Id" name="bookId" readonly="true"/> <br>
            <s:textfield label="Book Title" name="title"/> <br>
            <s:textfield label="Book Price" name="price"/> <br>
            <s:textfield label="Book Description" name="description"/> <br>
            <s:textfield label="Book DateTime" name="dateTime"/> <br>
            <s:textfield label="Book Image" name="image"/> <br>
            <s:submit  method="execute" value="Update"/>
        </s:form>
    </body>
</html>
