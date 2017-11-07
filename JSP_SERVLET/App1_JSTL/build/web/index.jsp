<%-- 
    Document   : index
    Created on : Nov 1, 2017, 7:43:23 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book List!</h1>
        <jsp:useBean id="mybean" class="model.DataProcess" scope="session" />
        <table border="1" width="60%" align="center" >
            <tr>
                <th>bookId</th>
                <th>title</th>
                <th>price</th>
            </tr>
            <c:forEach var="p" items="${mybean.data}">
                <tr>
                    <td>${p.bookId}</td>
                    <td>${p.title}</td>
                    <td>${p.price}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
