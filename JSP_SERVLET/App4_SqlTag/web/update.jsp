<%-- 
    Document   : update
    Created on : Nov 18, 2017, 8:09:37 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            SELECT * from product where id=?;
            <sql:param value="${param.id}" />
        </sql:query>
        <form action="updatedb.jsp" method="post">
            <table border="0" width="40%">
                <caption>Update Product</caption>
                <tr>
                    <th>Product Name</th>
                    <th>Quantity</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><input type="hidden" value="${param.id}" name="id"/>
                            <input type="text" value="${row.pname}" name="pname"/></td>
                        <td><input type="text" value="${row.quantity}" name="qty"/></td>
                        <td><input type="submit" value="Update"/></td>
                    </tr>
                </c:forEach>
            </table>
            <a href="index.jsp">Go Home</a>
        </form>
    </body>
</html>
