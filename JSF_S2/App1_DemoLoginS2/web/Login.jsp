<%-- 
    Document   : Login
    Created on : Dec 21, 2017, 4:08:39 PM
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
        <h1>Login Page!</h1>
        <s:form action="login" method="POST" >
            <s:textfield value="UserName" name="user"/>
            <s:password value="PassWord" name="pass"/>
            <s:submit method="execute" value="Login" />
        </s:form>
    </body>
</html>
