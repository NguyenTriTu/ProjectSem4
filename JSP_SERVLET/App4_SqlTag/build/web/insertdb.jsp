<%-- 
    Document   : insertdb
    Created on : Nov 18, 2017, 5:57:05 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${ empty param.pname or empty param.qty}">
            <c:redirect url="insert.jsp" >
                <c:param name="errMsg" value="Please Enter Product and Quantity" />
            </c:redirect>

        </c:if>
         <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=loginjdbc"
                           user="sa"  password="123456"/>


        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO product(pname, quantity) VALUES (?,?);
            <sql:param value="${param.pname}" />
            <sql:param value="${param.qty}" />
        </sql:update>
        <c:if test="${result>=1}">
            <font size="5" color='green'> Congratulations ! Data inserted
            successfully.</font>

            <c:redirect url="insert.jsp" >
                <c:param name="susMsg" value="Congratulations ! Data inserted
                         successfully." />
            </c:redirect>
        </c:if> 
    </body>
</html>
