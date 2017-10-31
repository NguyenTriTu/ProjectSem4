<%-- 
    Document   : View
    Created on : Oct 28, 2017, 10:12:35 AM
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
            String a = (String)request.getAttribute("rmb");
        if(request.getCookies()==null){
            response.sendRedirect("controller");   
        }else{
        Cookie[] cookie = request.getCookies();
        for(int i = 0; i < cookie.length;i++){
           String name = cookie[i].getName();
           String values = cookie[i].getValue();
        %>
        <p><%=name%></p>
        <p><%=values%></p>
       
        <%}}%>
        
        <%
        String ss = (String) request.getAttribute("session");
        %>
<!--        <p>Session ID : <%=ss%></p><br/> -->
        <p>RMB Values : <%=a%> </p>
    </body>
</html>
