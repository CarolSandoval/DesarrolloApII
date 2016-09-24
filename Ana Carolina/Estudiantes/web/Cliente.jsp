
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <form action="ClienteController" method="post">
            <fieldset>
                <legend>Formulario de registro de clientes</legend>
                
                <div>
                <label for="idCliente">Id Cliente:</label>
                <input type="text" name="idCliente"
                       value="${cliente.idCliente}"
                       readonly="readonly" 
                       placeholder="Id de cliente"/>
                </div>
                
                <div>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre"
                       value="${cliente.nombre}"
                       placeholder="Nombre del cliente"/>
                </div>
                 
                <div>
                <label for="domicilio">Domicilio:</label>
                <input type="text" name="domicilio"
                       value="${cliente.domicilio}"
                       placeholder="Domicilio del cliente"/>
                </div>
                         <div>
                <label for="telefono">Telefono:</label>
                <input type="text" name="telefono"
                       value="${cliente.telefono}"
                       
                       placeholder="Telefono del cliente"/>
                </div>
                
                <div>
                <label for="celular">Celular:</label>
                <input type="text" name="celular"
                       value="${cliente.celular}"
                       
                       placeholder="Celular del cliente"/>
                </div>
                  
                
                <div>
                <label for="correo">Correo:</label>
                <input type="text" name="correo"
                       value="${cliente.correo}"
                       placeholder="Correo"/>
                </div>
                       
               
                
                 <div>
                     <input type="submit" 
                       value="Guardar" />
                </div>
            </fieldset>
            
        </form>
    </body>
</html>
