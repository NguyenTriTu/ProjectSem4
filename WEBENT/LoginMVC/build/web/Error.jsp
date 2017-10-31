<%-- 
    Document   : Error
    Created on : Oct 2, 2017, 7:40:47 PM
    Author     : Apple
--%>

<%@page import="model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Book bookn = new Book();
            bookn =(Book) request.getAttribute("bookerror");
            int id = bookn.getBookId();
            String title = bookn.getTitle();
        %>
        <h1>Error Page</h1>
        <p><%=id%></p>
        <p><%=title%></p>
    </body>
</html>
