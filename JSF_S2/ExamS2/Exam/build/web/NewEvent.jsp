<%-- 
    Document   : AddNew
    Created on : Dec 22, 2017, 7:26:45 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="create" method="POST" >
            <table border="1" >
                <tr>
                    <td> When? </td>
                    <td>   <s:textfield  type="date" name="date"/> <s:textfield value="" type="time" name="time" /> <br></td>
                </tr>
                <tr>
                    <td> What are you planning</td>
                    <td>  <s:textfield   name="plan"/> <br></td>
                </tr>
                <tr>
                    <td>where? </td>
                    <td>  <s:textfield name="where"/> <br></td>
                </tr>
                <tr> 
                    <td>More info?</td>
                    <td>  <s:textfield name="info"/> <br></td>
                </tr>
                <s:submit method="execute" value="Create Event" /><br>
            </table>
        </s:form>
    </body>
</html>
