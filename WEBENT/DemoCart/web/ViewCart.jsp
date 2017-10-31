<%-- 
    Document   : ViewCart
    Created on : Oct 16, 2017, 9:52:10 AM
    Author     : Apple
--%>

<%@page import="entity.Book"%>
<%@page import="model.DataProcess"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Hashtable"%>
<%@page import="entity.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
    </head>
    <body>
        <h1>Your Cart Details!</h1>
        <table Border="1" width="60%" align="center" >
            <tr>
                <th>CartId</th>
                <th>BookId</th>
            </tr>
            <%
                Cart cart = (Cart) session.getAttribute("cart");
                Hashtable content = cart.getContent();
                Enumeration enumerration = content.keys();

                while (enumerration.hasMoreElements()) {
                    String id = enumerration.nextElement().toString();
                    String quantity = content.get(id).toString();

            %>

            <tr>
                <td><%=quantity%></td>
                <td><%=id%></td>
            </tr>       
            <%}%>
        </table>


    </body>
</html>
