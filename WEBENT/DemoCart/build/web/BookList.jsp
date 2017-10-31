<%-- 
    Document   : BookList.jsp
    Created on : Oct 16, 2017, 9:27:14 AM
    Author     : Apple
--%>

<%@page import="entity.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Book</title>
    </head>
    <body>
        <%
            if (getServletContext().getAttribute("data") == null) {
                response.sendRedirect("BookControl?action=getdata");
            } else {

        %>
        <h1>Book List~!</h1>
        <table Border="1" width="90%" align="center" >
            <tr>
                <th>BookId</th>
                <th>Title</th>
                <th>Price</th>
                <th>Description</th>
                <th>DateTime</th>
                <th>Image</th>     
                <th>Delete</th>
                <th>Edit</th>
            </tr>
            <%  ArrayList list = new ArrayList();
                list = (ArrayList) getServletContext().getAttribute("data");
                for (int i = 0; i < list.size(); i++) {
                    Book newBook = (Book) list.get(i);
                    int id = newBook.getBookId();
                    String title = newBook.getTitle();
                    String date = newBook.getDatetime();
                    String des = newBook.getDescription();
                    String image = newBook.getImage();
                    double price = newBook.getPrice();
                    
            %>
            <tr>
                <td><%=id%></td>
                <td><%=title%></td>
                <td><%=price%></td>
                <td><%=des%></td>
                <td><%=date%></td>
                <td><%=image%></td>        
                <td>
                    <a href="BookControl?action=Del&id=<%=id%>">DELETE</a>
                </td>        
                <td>
                    <a href="BookControl?action=Edit&id=<%=id%>">EDIT</a>
                </td>        
                <td>
                    <a href="CartControl?action=add&id=<%=id%>">Add to Cart</a>
                </td>        
            </tr>
            <% }
            %>
        </table>
        <% }
        %>
    </body>
</html>
