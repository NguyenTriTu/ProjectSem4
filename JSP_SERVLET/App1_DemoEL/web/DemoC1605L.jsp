<%-- 
    Document   : DemoC1605L
    Created on : Nov 3, 2017, 7:17:06 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<c:set var="current" value="${param.dllLanguage}" scope="session" />
<c:if test="${not empty current}" >
    <fmt:setLocale value="${current}" scope="session" />
</c:if>
<fmt:setBundle basename="c1605l.myResource" scope="session"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title" /></title>
    </head>
    <body>
        <h1><fmt:message key="message" /></h1>
        <fmt:message key="language"/>
        
        <form action="#" method="POST">
            <select name="dllLanguage"  >
                <option value="vi_VN">Viet Nam</option>
                <option value="en_US" >English</option>
                <option value="fr_BE" >France</option>
            </select>
            <input type="submit" value="<fmt:message key="button" />"/>
        </form>
    </body>
</html>
