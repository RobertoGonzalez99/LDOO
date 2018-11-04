<%-- 
    Document   : exito
    Created on : 29/09/2018, 01:42:12 PM
    Author     : luis_
--%>
<%@page import = "modelo.Persona" %>
<% Persona p = (Persona)request.getSession().getAttribute("persona2"); %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <h1>Datos ingresados correctamente</h1>
         <h3>Bienvenidos ${sessionScope.user} </h3>
        
        
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"> Bienvenido Usuario: <%=p.getMat() %></font></center></p>

            <input type="button" onclick=" location.href='login.jsp' " value="Cerrar Sesion" name="boton" /> 
            <input type="button" onclick=" location.href='perfil.jsp' " value="Perfil" name="boton" /> 
    </body>
</html>
