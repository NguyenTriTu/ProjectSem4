<%-- 
    Document   : Home
    Created on : Oct 2, 2017, 7:40:37 PM
    Author     : Apple
--%>

<%@page import="java.net.*" %>
<%@page import="model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book List!</h1>
        <%          
            ArrayList list = new ArrayList();
            if (request.getAttribute("Blist") == null) {   
                response.sendRedirect("Controller?action=getData");
            } else {
                list = (ArrayList) request.getAttribute("Blist");   
                String song =(String)request.getAttribute("TDT");
        %>
        <h1> Song:  <%=song%></h1>
        <table Border="1">
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
            <% for (int i = 0; i < list.size(); i++) {
                    Book newBook = (Book) list.get(i);
                    int id = newBook.getBookId();
                    String title = newBook.getTitle();
                    String date = newBook.getDateTime();
                    String des = newBook.getDescription();
                    String image = newBook.getImage();
                    float price = newBook.getPrice();
            %>
            <tr>
                <td><%=id%></td>
                <td><%=title%></td>
                <td><%=price%></td>
                <td><%=des%></td>
                <td><%=date%></td>
                <td><%=image%></td>        
                <td>
                    <a href="Controller?action=Del&id=<%=id%>">DELETE</a>
                </td>        
                <td>
                    <a href="Controller?action=Edit&id=<%=id%>">EDIT</a>
                </td>        
            </tr>
            <% }
                }%>
        </table>
    </body>
</html>
