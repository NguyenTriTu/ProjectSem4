<%-- 
    Document   : deletedb
    Created on : Nov 18, 2017, 8:27:47 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=loginjdbc"
                           user="sa"  password="123456"/>
        <sql:update dataSource="${dbsource}" var="count">
            DELETE FROM product
            WHERE id='${param.id}'
        </sql:update>
        <c:if test="${count>=1}">
            <font size="5" color='green'> Congratulations ! Data deleted
            successfully.</font>
            <a href="index.jsp">Go Home</a>          
        </c:if>
    </body>
</html>
