<%-- 
    Document   : index
    Created on : 29/09/2018, 12:54:04 PM
    Author     : luis_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <h1>FORMULARIO</h1>
    <center><form action="Procesar" method="POST">
            ${sessionScope.sessionAttributeName}
            <input type="text" name="nom" id="nombre" placeholder="Nombre" required/><br>
            <input type="text" name="mat" id="matricula" placeholder="Matricula" required="" /><br>
            <input type="email" name="corr" id="email" placeholder= "E-mail" required /><br>
            <input type="text" name="tel" id="telefono" placeholder="Telefono" required/><br>
            <input type="password" name="pass" id="password" placeholder="Contraseña" required/><br>
            <button type="submit">Aceptar</button><br>
        </form></center>
    </body>
</html>
