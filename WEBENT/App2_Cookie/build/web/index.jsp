<%-- 
    Document   : index
    Created on : Oct 28, 2017, 9:38:14 AM
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

        <%
            if (request.getCookies() != null) {
                Cookie cookie[] = request.getCookies();
                String user = "";
                String pass = "";
                for (int i = 0; i < cookie.length; i++) {
                    if ("user".equals(cookie[i].getName())) {
                        user = cookie[i].getValue();
                    }
                    if ("pass".equals(cookie[i].getName())) {
                        pass = cookie[i].getValue();
                    }
                }
                if ("".equals(user)) {
        %>
        <h1>Login Form</h1>
        <form action="Controller" method="POST">
            User : <input type="text" name="txtUser" value=""/>
            Pass : <input type="password" name="txtPass" value=""/>
            <input type="submit" value="Login"/>
            <input type="checkbox" value="RMB LOG" name="ckRMB"/>
        </form>

        <%} else {%>
        <h1>WellCome Back</h1>
        <form action="Controller" method="POST">
            User : <input type="text" name="txtUser" value="<%=user%>"/>
            Pass : <input type="password" name="txtPass" value="<%=pass%>"/>
            <input type="submit" value="Login"/>
            <input type="checkbox" checked="true" name="ckRMB"/>
        </form>


        <%}
        } else
        response.sendRedirect("Test");
        %>
    </body>
</html>
