<%-- 
    Document   : home.jsp
    Created on : 8/10/2022, 07:55:31 AM
    Author     : JP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% 
        response.setHeader("Cache-Control", "nocache, no-store, must-revalidate");
        if(session.getAttribute("user")==null){
            response.sendRedirect("/index.jsp");
        }
    %>
    <body>
        <h1>MENU</h1>
        
        <a href="Logout">Cerrar Sesion</a>
            <div class="alert alert-danger" id="error">
                <%request.getSession().getAttribute("user");%>
            </div>
    </body>
</html>
