<%-- 
    Document   : Events
    Created on : Dec 22, 2017, 7:40:30 PM
    Author     : vuongnguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Event</h1>
        <table>
            <c:forEach items="${items}" var="even">
                <tr>
                    <td>When</td>
                    <td>${even.date} time ${even.time}</td>
                </tr>
                <tr>
                    <td>Plan</td>
                    <td>${even.plan}</td>
                </tr>
                <tr>
                    <td>Where</td>
                    <td>${even.where}</td>
                </tr><tr>
                    <td>Info</td>
                    <td>${even.info}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>