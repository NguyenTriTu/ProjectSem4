<%-- 
    Document   : viewjsp
    Created on : Oct 29, 2017, 11:24:29 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        
          <%
              // Check session login
            if(request.getSession().getAttribute("userSession")==null){
                response.sendRedirect("index.jsp");
            }else{
            String a =(String)request.getSession().getAttribute("userSession");
            %>
        
            <h1>Wellcom <%=a%></h1>
        
        <%
            }
        %>
        
    </body>
</html>
