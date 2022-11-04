<%-- 
    Document   : home.jsp
    Created on : 4/11/2022, 13:55:31 AM
    Author     : Angel Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PrograII - App Web</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        
        <script src="js/registroUsuariojavascript.js"></script>
        
    </head>
    <body>  
        
        <img src="imagenes/logoMiumg3.png" align="center" alt=""/>
        <img src="imagenes/cabecera.jpg" align="center" alt=""/>
        <img src="imagenes/logoMiumg2.jpg" align="center" alt=""/>
   
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <a class="navbar-brand" href="https://www.canva.com/design/DAFRBGsJ7WY/GopQndEpzUBWSFznj2fgJA/view?utm_content=DAFRBGsJ7WY&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink">QUIENES SOMOS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="homePrincipal.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          
          <li class="nav-item active">
              <a class="nav-link" aria-current="page" href="homeLibro.jsp">Registro Libro</a>
          </li>

          <li class="nav-item active">
              <a class="nav-link" aria-current="page" href="homeUsuario.jsp">Registro Usuario</a>
          </li>
         
 <%--          
          
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
              MENU
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="homeLibro.jsp">Registro Libro</a>
              
              <a class="dropdown-item" href="homeUsuario">Registro Usuario</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled">Disabled</a>
          </li>
 
 --%>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>    
    
        
    
    
    <div class="d-flex justify-content-around">
        <div class="p-3 bd-highlight">
        <h1>Formulario de Registro de Usuarios</h1>
        <a href="RegistUsuarioServlet" > Click aqui </a><br><br>
        <form method="POST" id="form" name="form" action="NewServlet1" >
  
            <div class="form-group">
                <label for="exampleInputName">Codigo Usuario</label>
                <input class="form-control" type="text" placeholder="ingresar codigo" name="codigo_usuario" id="codigo_usuario" >
                <input type="hidden" name="control" value="GUARDAR">
            </div>
            <div class="form-group">
                <label for="exampleInputName">Nombre del usuario</label>
                <input class="form-control" type="text" placeholder="ingresar nombre" name="nombre_usuario" id="nombre_usuario" >
            </div>
            <div class="form-group">
              <label for="exampleInputEmail1">correo</label>
              <input type="email" class="form-control"  aria-describedby="emailHelp" name="correo" id="correo"  >
              <small id="emailHelp" class="form-text text-muted"></small>
            </div>
                        
            <select class="form-control" name="opcion">
                <option value="1">Opción 1</option>
                <option value="2">Opción 2</option>
            </select><br>
            <%-- <button type="submit" class="btn btn-primary">Guardar</button> --%>
            <button type="button" onclick="enviarRegistroUsuario()" class="btn btn-success">Guardar</button>
             <button type="button" class="btn btn-danger">Cancelar</button>
        </form>   
        </div>
       <div class="p-3 bd-highlight">
            <div class="container" id="container2">
                <table class="table table-striped table-hover">
                    <thead class="table-dark">
                        <tr>
                            <td>Codigo de Usuario</td>
                            <td>Nombre del Usuario</td>
                             <td>Correo</td>
                            
                            <td>Tipo</td>
                            <td>Acción</td>
                        </tr>
                    </thead>
                    <tbody id="bodyTable">

                    </tbody>                     
                </table>
            </div>
        </div>
        </div>
    </body>
</html>
