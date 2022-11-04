<%-- 
    Document   : EntryReport
    Created on : 28/10/2022, 11:10:25
    Author     : ramir
--%>

<%@page import="java.sql.*"%>
<%@page import="Class.DatabasaConnection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
          <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
                    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
                    <!-- JavaScript Bundle with Popper -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
                    <link href="FormStyle.css" rel="stylesheet" type="text/css"/>
                    <title>JSP Page</title>
          </head>
          <body>                     
                    <header class="header">
                              <nav class="navbar navbar-expand-lg navbar-dark">
                                        <div class="container-fluid">
                                                  <a class="navbar-brand" href="#">
                                                            <img src="https://materilejuguetes.com/img/entrega.png" width="60" height="60" alt="">
                                                            Transportes Ultrarrápidos
                                                  </a>
                                                  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                                            <span class="navbar-toggler-icon"></span>
                                                  </button>
                                                  <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                                            <ul class="navbar-nav m-auto">
                                                                      <li class="nav-item active">
                                                                                <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
                                                                      </li>
                                                                      <li class="nav-item dropdown">
                                                                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                                                                          Registrar
                                                                                </a>
                                                                                <ul class="dropdown-menu dropdown-menu-dark" id="menu-navbar">
                                                                                          <li><a class="dropdown-item" href="TransporterForm.jsp">Registrar Transportista</a></li>
                                                                                          <li><a class="dropdown-item" href="DriverForm.html">Registrar Piloto</a></li>
                                                                                          <li><a class="dropdown-item" href="TruckForm.html">Registrar Camión</a></li>
                                                                                          <li><a class="dropdown-item" href="EntryForm.html">Registrar Ingreso</a></li>
                                                                                          <li><a class="dropdown-item" href="EgressForm.html">Registrar Egreso</a></li>
                                                                                          <li><hr class="dropdown-divider"></li>
                                                                                </ul>
                                                                      </li>
                                                                      <li class="nav-item dropdown">
                                                                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                                                                          Reportes
                                                                                </a>
                                                                                <ul class="dropdown-menu dropdown-menu-dark" id="menu-navbar2">                                                              
                                                                                          <li><a class="dropdown-item" href="TransporterReport.jsp">Reporte Tansportista</a></li>
                                                                                          <li><a class="dropdown-item" href="TruckReport.jsp">Reporte Camión</a></li>
                                                                                          <li><a class="dropdown-item" href="EgressReport.jsp">Reporte Egreso</a></li>
                                                                                </ul>
                                                                      </li>
                                                                      <li class="nav-item dropdown">
                                                                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                                                                          Reportes
                                                                                </a>
                                                                                <ul class="dropdown-menu dropdown-menu-dark" id="menu-navbar2">                                                              
                                                                                          <li><a class="dropdown-item" href="TransporterReport.jsp">Reporte Tansportista</a></li>
                                                                                          <li><a class="dropdown-item" href="TruckReport.jsp">Reporte Camión</a></li>
                                                                                          <li><a class="dropdown-item" href="EgressReport.jsp">Reporte Egreso</a></li>
                                                                                </ul>

                                                                      </li>
                                                            </ul>
                                                            <form class="d-flex" role="search">
                                                                      <a class="btn btn-outline-dark text-white"  href="Logout">Cerrar Sesion</a>
                                                            </form>
                                                  </div>
                                        </div>
                              </nav>
                    </header>
                    <%
                              DatabasaConnection conn = new DatabasaConnection();
                              Statement smt;
                              ResultSet rs;
                              smt = conn.connection().createStatement();
                              rs = smt.executeQuery("SELECT * FROM transportes_ultrarrapidos_sa.registro_ingreso");
                    %>
                    <div class="container mx-auto">
                              <div class="d-flex justify-content-end mx-5 my-4">
                                        <form class="d-flex" role="search">
                                                  <input class="form-control me-2" type="time" name="txtTime">
                                                  <input class="form-control me-2" type="text" name="txtDay" placeholder="dd/MM/yyy">
                                                  <input class="btn btn-outline-dark text-white" type="submit" value="Buscar">
                                        </form>
                                        <%
                                                  String nameSearch = request.getParameter("txtTime");
                                                  String daySearch = request.getParameter("txtDay");
                                                  if (nameSearch != null) {
                                                            smt = conn.connection().createStatement();
                                                            rs = smt.executeQuery("SELECT * FROM transportes_ultrarrapidos_sa.registro_ingreso WHERE hora LIKE" + " '%" + nameSearch + "%' AND dia LIKE" + " '%" + daySearch +"%' " );
                                                  } else {
                                                            System.err.print("Error");
                                                  }
                                        %>
                              </div>
                              <a href="EntryForm.html" class="btn btn-outline-dark text-white">Nuevo Registro</a>
                              <c:if test="${error ==1}">
                                        <div class="alert alert-danger" id="error">${message}</div>
                              </c:if>
                              <div class="table-responsive mx-4 my-4">
                                        <table class="table table-hover table-dark">
                                                  <tr>
                                                            <th scope="col">ID Ingreso</th>
                                                            <th scope="col">DPI Transportista</th>
                                                            <th scope="col">DPI Piloto</th>
                                                            <th scope="col">Placa Camión</th>
                                                            <th scope="col">Hora</th>
                                                            <th scope="col">Día</th>
                                                            <th scope="col">Predio</th>
                                                            <th scope="col">Bodega</th>
                                                            <th scope="col">Origen</th>
                                                            <th scope="col">Tipo de Carga</th>
                                                  </tr>
                                                  <%
                                                            while (rs.next()) {
                                                  %>
                                                  <tr>
                                                            <td><%= rs.getString("id_registro_ingreso")%></td>
                                                            <td><%= rs.getString("transportista_id_transportista")%></td>
                                                            <td><%= rs.getString("id_dpi_piloto")%></td>
                                                            <td><%= rs.getString("camion_placa_camion")%></td>
                                                            <td><%= rs.getString("hora")%></td>
                                                            <td><%= rs.getString("dia")%></td>
                                                            <td><%= rs.getString("id_predio")%></td>
                                                            <td><%= rs.getString("id_bodega")%></td>
                                                            <td><%= rs.getString("origen")%></td>
                                                            <td><%= rs.getString("tipo_carga")%></td>
                                                  </tr>
                                                  <%}%>
                                        </table>
                              </div>
                    </div>
          </body>
</html>
