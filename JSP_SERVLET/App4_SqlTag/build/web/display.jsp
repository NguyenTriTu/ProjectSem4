<%-- 
    Document   : display
    Created on : Nov 18, 2017, 5:58:02 AM
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
        <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=loginjdbc"
                           user="sa"  password="123456"/>

        <sql:query dataSource="${dbsource}" var="result">
            SELECT * from product;
        </sql:query>
    <center>
        <form>
            <table border="1" width="40%">
                <caption>Product List</caption>
                <tr>
                    <th>Product ID</th>
                    <th>Product Name</th>
                    <th>Quantity</th>
                    <th colspan="2">Action</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><c:out value="${row.id}"/></td>
                        <td><c:out value="${row.pname}"/></td>
                        <td><c:out value="${row.quantity}"/></td>
                        <td><a href="update.jsp?id=<c:out value="${row.id}"/>">Update</a></td>
                        <td><a href="deletedb.jsp?id=<c:out value="${row.id}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <a href="index.jsp">Go Home</a>
    </center>
</body>
</html>
