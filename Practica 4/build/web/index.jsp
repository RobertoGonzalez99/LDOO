<%-- 
    Document   : index
    Created on : 19/09/2018, 06:50:41 PM
    Author     : luis_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRACTICA 4</title>
    </head>
    
    <body>
        <form action="Reloj_jsp" method="POST"><center>
            <div>
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" required/>
            </div>       
            <div>
                <label for="email">E-mail:</label>
                <input type="email" id="email" required/>
            </div>
            <div> 
                <label for="contraseña">Contraseña:</label>
                <input type="password" id="password" required/>
            </div>
            <div> 
                <label for="telefono">Telefono:</label>
                <input type="text" id="telefono" required/>
            <div>
                <button type="submit">Aceptar</button>
            </div>
        </form></center>
            
    </body>
    
</html>
