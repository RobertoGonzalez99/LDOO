<%-- 
    Document   : exito
    Created on : 29/09/2018, 01:42:12 PM
    Author     : luis_
--%>
<%@page import = "modelo.Persona" %>
<% Persona p = (Persona)request.getSession().getAttribute("persona1"); %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <h1>Datos ingresados correctamente</h1>
        
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"> Nombre: <%=p.getNom()%></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"> Matricula: <%=p.getMat() %></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"><center> Correo: <%=p.getCorr() %></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"><center> Telefono: <%=p.getTel() %></font></center></p>
        
    </body>
</html>
