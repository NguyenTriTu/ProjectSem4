<%-- 
    Document   : list.jsp
    Created on : Nov 27, 2017, 7:13:38 PM
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
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=LoginMVC"
                           user="sa"  password="123456"/>
        <c:if test="${ empty param.p1 or empty param.p2}">
            <c:redirect url="employee.jsp" >
                <c:param name="errMsg" value="Please Enter Product and Quantity" />
            </c:redirect>
        </c:if>
        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO InfoEmployee VALUES (?,?,?,?,?,?);
            <sql:param value="${param.p1}" />
            <sql:param value="${param.p2}" />
            <sql:param value="${param.p3}" />
            <sql:param value="${param.p4}" />
            <sql:param value="${param.p5}" />
            <sql:param value="${param.p6}" />
        </sql:update>
        <sql:query dataSource="${dbsource}" var="result">
            SELECT * from InfoEmployee;
        </sql:query>
    <center>
        <form>
            <table border="1" width="40%">
                <caption>Employee List</caption>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee Name</th>
                    <th>Employee Birthday</th>
                    <th>Employee _Address</th>
                    <th>Employee Position</th>
                    <th>Employee Department</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><c:out value="${row.ID}"/></td>
                        <td><c:out value="${row.FullName}"/></td>
                        <td><c:out value="${row.Birthday}"/></td>
                        <td><c:out value="${row._Address}"/></td>
                        <td><c:out value="${row.Position}"/></td>
                        <td><c:out value="${row.Department}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <a href="employee.jsp">Go Home</a>
    </center>
</body>
</html>
