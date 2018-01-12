<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>List Book !</h1>
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
            <s:iterator var="b" value="items" >
                <tr>
                    <td><s:property value="#b.BookId" /></td>
                    <td><s:property value="#b.title" /></td>
                    <td><s:property value="#b.price" /></td>
                    <td><s:property value="#b.description" /></td>
                    <td><s:property value="#b.dateTime" /></td>
                    <td><s:property value="#b.image" /></td>
                    <td><a href="delete?id=<s:property value="#b.BookId"/>"/>Delete</td>
                    <td><a href="update?id=<s:property value="#b.BookId"/>"/>Edit</td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
