<%-- 
    Document   : index
    Created on : Nov 23, 2017, 7:17:34 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="TagIteration" uri="/WEB-INF/tlds/TagLibDescription.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <TagIteration:TagIteration count="5">
        <h1>Hello World!</h1>
        </TagIteration:TagIteration>
    </body>
</html>
