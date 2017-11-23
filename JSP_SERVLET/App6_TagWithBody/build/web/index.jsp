<%-- 
    Document   : index
    Created on : Nov 23, 2017, 5:09:57 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="UppercaseTag" uri="/WEB-INF/tlds/TagWithBody.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <UppercaseTag:UpperCase>
            These is follow information are displayed using tag handler :
            <OL>
                <%-- This give current time system --%>
                <LI>Current Time : <%=new java.util.Date()%>
                <%-- This provides the host name --%>
                <LI>Requesting hostname : <%= request.getRemoteHost()%>
                <%-- This providest the current session id --%>
                <LI>Session ID: <%= session.getId()%>
            </OL>
        </UppercaseTag:UpperCase>
    </body>
</html>
