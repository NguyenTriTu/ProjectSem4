<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <s:head />
    </head>
    <body>
        <s:form action="Login">
            <s:textfield name="userName" cssClass="form-control input-md" label="User Name" />
            <s:password name="password" cssClass="form-control input-md" label="Password" />
            <s:submit value="Login" cssClass="btn btn-primary" />
        </s:form>
    </body>
</html>
