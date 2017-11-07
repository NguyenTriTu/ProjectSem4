<%-- 
    Document   : DemoFunciton
    Created on : Nov 6, 2017, 7:49:53 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="/WEB-INF/tlds/myFunciton.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty param.txtN}" >
                <form action="#" method="POST">
                    N <input type="text" name="txtN" >
                    M <input type="text" name="txtM" >
                    <input type="submit" value="Add" >
                </form>
            </c:when>
            <c:otherwise>
                ${fn:add(param.txtN, param.txtM)}
            </c:otherwise>
        </c:choose>
        
    </body>
</html>
