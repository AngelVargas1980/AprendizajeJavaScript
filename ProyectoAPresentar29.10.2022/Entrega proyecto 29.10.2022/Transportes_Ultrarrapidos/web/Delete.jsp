<%-- 
    Document   : Delete
    Created on : 27/10/2022, 11:43:28
    Author     : ramir
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
          <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <title>JSP Page</title>
          </head>
          <body>
                    <%

                              Connection conn;
                              String url = "jdbc:mysql://localhost:3306/transportes_ultrarrapidos_sa";
                              String Driver = "com.mysql.jdbc.Driver";
                              String user = "root";
                              String pass = "root";
                              try {
                                        Class.forName(Driver);
                                        conn = DriverManager.getConnection(url, user, pass);
                                        PreparedStatement ps;

                                        String id = request.getParameter("id");
                                        ps = conn.prepareStatement("delete from transportes_ultrarrapidos_sa.transportista where id_transportista=" + id);
                                        ps.executeUpdate();
                                        response.sendRedirect("TransporterReport.jsp");
                              } catch (Exception e) {
                                        request.setAttribute("error", 1);
                                        request.setAttribute("message", "No puede ser eliminado un/a transportista con camiones registrados");
                                        request.getRequestDispatcher("/TransporterReport.jsp").forward(request, response);
                              }
                    %>
          </body>
</html>
