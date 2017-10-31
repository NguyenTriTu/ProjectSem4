<%-- 
    Document   : Edit
    Created on : Oct 7, 2017, 3:03:53 PM
    Author     : Apple
--%>

<%@page import="model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Book newBook = new Book();
            if (request.getAttribute("book") == null) {
                response.sendRedirect("Controller?action=getData");

            } else {
                newBook = (Book) request.getAttribute("book");
            }
            int id = newBook.getBookId();
            String title = newBook.getTitle();
            String date = newBook.getDateTime();
            String des = newBook.getDescription();
            String image = newBook.getImage();
            float price = newBook.getPrice();
            
        %>

        <FORM action="Controller" method="POST" >
            BookId<input type="text" value="<%=id%>" readonly name="txtbookId"/><br/>
            Title<input type="text" value="<%=title%>"  name="txtTitle"/><br/>
            Price<input type="text" value="<%=price%>" name="txtPrice"/><br/>
            Description<input type="text" value="<%=des%>" name="txtDescription"/><br/>
            DateTime<input type="text" value="<%=date%>" name="txtDateTime"/><br/>
            Image<input type="text" value="<%=image%>" name="txtImage"/><br/>
            <input type="submit" name="action" value="Update"/>


        </FORM>
    </body>
</html>
