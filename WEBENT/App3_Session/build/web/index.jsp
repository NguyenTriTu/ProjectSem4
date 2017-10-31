<%-- 
    Document   : index
    Created on : Oct 28, 2017, 8:33:54 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <form action="Controller" method="POST">
            User : <input type="text" name="txtUser" value=""/>
            Pass : <input type="password" name="txtPass" value=""/>
            <input type="submit" value="Login"/>   
        </form>
    </body>
</html>
