<%-- 
    Document   : DemoFunction
    Created on : Nov 6, 2017, 7:14:18 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="maiFN" uri="/WEB-INF/tlds/myFunction.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty param.txtN}">
                 <h1>Demo EL Function!</h1>
                 <form action="#" method="POST">
                     N: <input type="text" name="txtN"/> <br/>
                     M: <input type="text" name="txtM"/><br/>
                     <input type="submit" value="Add"/>
                 </form>
            </c:when>
            <c:otherwise>
                Sum = ${maiFN:add(param.txtN, param.txtM)}
            </c:otherwise>
        </c:choose>
       
    </body>
</html>
