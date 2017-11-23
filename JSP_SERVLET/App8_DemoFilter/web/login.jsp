<%-- 
    Document   : login
    Created on : Nov 23, 2017, 7:53:28 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Login form !@</h3>
        <form action="Controller" method="post" >
            User : <input type="text" name="txtUser"/>
            Pass : <input type="text" name="txtPass"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
