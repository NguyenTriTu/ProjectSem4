<%-- 
    Document   : ViewCart
    Created on : Oct 16, 2017, 9:52:10 AM
    Author     : Apple
--%>

<%@page import="entity.BookCart"%>
<%@page import="entity.CartModel"%>
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
         <form method="post" action="CartControl?action=Update">
            <table Border="1" width="90%" align="center" >
                
                <tr>           
                  
                    <th>BookId</th>
                    <th>Title</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Amount</th>
                    <th>Delete</th>
                </tr>
                <%

                    CartModel cart = (CartModel) session.getAttribute("cart");
                    float total = 0;
                    for (int i = 0; i < cart.getContent().size(); i++) {
                        BookCart book = cart.getContent().get(i);
                        String id = book.getId();
                        String title = book.getTitle();
                        int q = book.getQuantity();
                        float price = book.getPrice();
                        float amount = q * price;
                        total += amount;    
                %>
                
               
                <tr>
                    <td><%=id%></td>
                    <td><%=title%></td>
                    <td><input type="text" name="txtQ" value="<%=q%>"/>
                    </td>
                    <td><%=price%></td>

                    <td><%=amount%></td>
                    <td><a href="CartControl?action=del&id=<%=id%>">Delete</a></td>  

                </tr>

                <tr>
                    <td colspan="3">Total Amount : </td>
                    <td colspan="2"><%=total%>$</td>
                </tr>
               

             
              
                 <%}%>
                 
                    <tr>
                    <td colspan="3">
                        <input type="submit" value="Okie" />
                    </td>
                </tr>
            </table>
          </form>

    </body>
</html>
