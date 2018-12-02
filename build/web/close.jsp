<%-- 
    Document   : close
    Created on : May 15, 2016, 2:44:09 AM
    Author     : m7md
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% session =request.getSession(false);
                    session.invalidate();
                    response.sendRedirect("login.html");
                    %>
    </body>
</html>
