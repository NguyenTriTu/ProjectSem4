<%-- 
    Document   : DemoFunciton
    Created on : Nov 6, 2017, 7:49:53 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="/WEB-INF/tlds/myFunction.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty param.txtName}" >
                <form action="#" method="POST">
                    N <input type="text" name="txtName" >
                    <input type="submit" value="Add" >
                </form>
            </c:when>
            <c:otherwise>

                <table border="1" width="60%" align="center" >
                    <tr>
                        <th>bookId</th>
                        <th>title</th>
                        <th>price</th>
                    </tr>
                    <c:forEach var="p" items="${fn:display(param.txtName)}">
                        <tr>
                            <td>${p.bookId}</td>
                            <td>${p.title}</td>
                            <td>${p.price}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>

    </body>
</html>
