<%-- 
    Document   : perfil
    Created on : 3/11/2018, 12:34:24 PM
    Author     : luis_
--%>
<%@page import="controlador.Procesar"%>
<%@page import = "modelo.Persona" %>
<% Persona p = (Persona)request.getSession().getAttribute("persona1"); %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"> Nombre: <%=p.getNom()%></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"> Matricula: <%=p.getMat() %></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"><center> Correo: <%=p.getCorr() %></font></center></p>
        <p><center><font Face="Arial" SIZE="4" COLOR="BLUE"><center> Telefono: <%=p.getTel() %></font></center></p>
  
        <input type="button" onclick=" location.href='exito.jsp' " value="Inicio" name="boton" /> 
            
  
    </body>
</html>
