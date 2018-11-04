<%-- 
    Document   : login
    Created on : 11/10/2018, 10:32:44 PM
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
        
        
        <form action="Login" method="POST">
            
            <input type="text" name="mat" id="matricula" placeholder="Matricula" required="" /><br>
            <input type="password" name="pass" id="password" placeholder="Contraseña" required/><br>
            <button type="submit">Aceptar</button><br>
        </form>
        
        <input type="button" onclick=" location.href='index.jsp' " value="Registro" name="boton" /> 
    </body>
</html>
            
