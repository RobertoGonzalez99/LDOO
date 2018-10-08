<%-- 
    Document   : login
    Created on : 6/10/2018, 11:33:51 PM
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
        <form action="LoginServlet">
            <pre>
                
                Usuario:        <input type="text" name="usuario">
                Contraseña:     <input type="password" name="password">

                    <input type="submit" value="Aceptar">

            </pre>
        </form>
    </body>
</html>
