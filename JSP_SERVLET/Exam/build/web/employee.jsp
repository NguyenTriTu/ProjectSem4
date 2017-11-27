<%-- 
    Document   : employee
    Created on : Nov 27, 2017, 7:16:25 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>    
        <script>
            $(".reset").bind("click", function () {
                $("input[type=text], textarea").val("");
            });
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="list.jsp" method="post">
            <table border="0" cellspacing="2" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Purchase Product</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label>Employee ID</label></td>
                        <td><input type="text" name="p1" required /></td>
                    </tr>
                    <tr>
                        <td><label>Employee Name</label></td>
                        <td><input type="text" name="p2" required/></td>
                    </tr>
                    <tr>
                        <td><label>Employee Birthday</label></td>
                        <td><input id="datetime" type="datetime-local" name="p3" ></td>
                    </tr>
                    <tr>
                        <td><label>Employee _Address</label></td>
                        <td><input type="text" name="p4" required/></td>
                    </tr>
                    <tr>
                        <td><label>Employee Position</label></td>
                        <td><input type="text" name="p5" required/></td>
                    </tr>
                    <tr>
                        <td><label>Employee Department</label></td>
                        <td><select name="p6" >
                                <option value="volvo">Volvo</option>
                                <option value="saab">Saab</option>
                                <option value="mercedes">Mercedes</option>
                                <option value="audi">Audi</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Save"/></td>
                        <td><input type="reset" value="reset"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
