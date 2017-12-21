<%-- 
    Document   : Login
    Created on : Oct 2, 2017, 7:41:09 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script lang="javacript" >
            function LoginClick()
            {
                this.frmLogin.action = "MySeverlet";
                this.frmLogin.submit();
            }
//             function RegisterClick()
//            {
//                this.frmLogin.action = "Controller?ac=Register";
//                this.frmLogin.submit();
//            }
//            

        </script>
    </head>
    <body>
        <%
            if (request.getCookies() != null) {
                Cookie c[] = request.getCookies();
                String u = "";
                String p = "";
                for (int i = 0; i < c.length; i++) {
                    if (c[i].getName().equals("user")) {
                        u = c[i].getValue();
                    }
                    if (c[i].getName().equals("pass")) {
                        p = c[i].getValue();
                    }

                }

        %>

        <h1>WellCome Back!</h1>
        <!--<FORM id="frmLogin" action="Controller?ac=add" >-->
        <FORM id="frmLogin" action="MySeverlet" method="post">
            User:<input type="text" name="txtUser" value="<%=u%>" /><br/>
            Pass:<input type="password" name="txtPass" value="<%=p%>"/><br/>
            <input type="submit" name="action" onclick="LoginClick()" value="Login"/>
            <input type="checkbox" name="ckRemember" checked="true"/>
            <!--            <input type="submit" name="action" onclick="RegisterClick()" value="Register"/>-->
        </Form>


        <%            } else {
        %>
        <h1>Login Form!</h1>
        <!--<FORM id="frmLogin" action="Controller?ac=add">-->
        <FORM id="frmLogin" action="MySeverlet" method="post">
            User:<input type="text" name="txtUser" value="" /><br/>
            Pass:<input type="password" name="txtPass"/><br/>
            <input type="submit" name="action" onclick="LoginClick()" value="Login"/>
            <input type="checkbox" name="ckRemember" value="Remember Acc"/>
            <!--            <input type="submit" name="action" onclick="RegisterClick()" value="Register"/>-->
        </FORM>
        <%
            }
        %>
    </body>
</html>
