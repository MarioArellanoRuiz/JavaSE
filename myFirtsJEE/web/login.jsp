<%-- 
    Document   : login
    Created on : Oct 24, 2017, 8:28:26 AM
    Author     : mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginService" method="post">
            <input type="text" name="usuario" /><br>
            <input type="password" name="password" /><br>
            <button type="submit"> Log in</button>
        </form>
        <% 
           out.println(request.getParameter("usuario"));
           out.println(request.getParameter("password"));
        %>
        
        
    </body>
</html>
