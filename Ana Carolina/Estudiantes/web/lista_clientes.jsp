

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
    </head>
    <body>
        <table>
            <thead>  
            <tr>
                <th>Id Cliente</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>telefono</th>
                <th>Celular</th>
                <th>Correo</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="cliente" 
                           items="${clientes}">
                    <tr>
                        <td>${cliente.idCliente}</td>
                        <td>${cliente.nombre}</td>
                        <td>${cliente.domicilio}</td>
                        <td>${cliente.telefono}</td>
                        <td>${cliente.celular}</td>
                        <td>${cliente.correo}</td>
                        <td><a href="ClienteController?action=cambiar&idCliente=${cliente.idCliente}">Cambiar</a></td>
                        <td><a href="ClienteController?action=borrar&idCliente=${cliente.idCliente}">Borrar</a></td>
                     </tr>  
                </c:forEach> 
            </tbody>
        </table>
        <p>
            <a href="ClienteController?action=agregar">
                Agregar cliente
            </a>
        </p>
    </body>
</html>
