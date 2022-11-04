<%-- 
    Document   : Transporter
    Created on : 18/10/2022, 14:39:30
    Author     : PC GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
          <head>
                    <title>Driver Record</title>
                    <title>Driver Record</title>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
                    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
                    <!-- JavaScript Bundle with Popper -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
                    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
                    <link href="FormStyle.css" rel="stylesheet" type="text/css"/>
                    <script src="js/scriptTrans.js" type="text/javascript"></script>
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
                                                                                          <li><a class="dropdown-item" href="EntryReport.jsp">Reporte Ingreso</a></li>
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


                    <div class="d-flex justify-content-around mx-4 my-5">
                              <div class="shadow-lg p-3 bg-white rounded">
                                        <form method="POST" id="form" name="form" action="TransporterController">
                                                  <div class="mt-3 mb-5 mx-4">
                                                            <img src="images/logo.png" class="rounded mx-auto d-block"   height="200" alt="...." >
                                                            <h2 class="display-4 text-center my-4">REGISTRO DE TRANSPORTISTA</h2>
                                                            <div class="row my-3">
                                                                      <div class="col">
                                                                                <label for="code">DPI DEL TRANSPORTISTA</label>
                                                                                <input type="text" class="form-control" placeholder="DPI" name="code" id="code">
                                                                                <input type="hidden" name="control" value="SAVE">
                                                                      </div>
                                                            </div>
                                                            <div class="row my-3">
                                                                      <div class="col">
                                                                                <label for="name">Nombres</label>
                                                                                <input type="text" class="form-control" placeholder="Nombre" name="name" id="name">
                                                                      </div>
                                                                      <div class="col">
                                                                                <label for="lastname">Apellidos</label>
                                                                                <input type="text" class="form-control" placeholder="Apellido" name="lastname" id="lastname">
                                                                      </div>
                                                            </div>
                                                            <div class="row my-3">
                                                                      <div class="col">
                                                                                <label for="email">Correo Electrónico</label>
                                                                                <input type="email" class="form-control" id="email" placeholder="Nombre@ejemplo.com" name="email">
                                                                                <small id="emailHelp" class="form-text text-muted">No comparta su correo electrónico con nadie más.</small>
                                                                      </div>
                                                                      <div class="col">
                                                                                <label for="license">Carnet De Conducir </label>
                                                                                <input type="text" class="form-control" placeholder="Carnet" name="license" id="license">
                                                                      </div>
                                                            </div>
                                                            <div class="contenido">
                                                                      <input type="button" onclick="sendForm()" class="btn btn-outline-dark" value="Registrar">
                                                                      <button type="reset" class="btn btn-outline-danger">Vaciar</button>
                                                            </div>
                                                  </div>
                                        </form>
                              </div>
                    </div>
          </body>
</html>
