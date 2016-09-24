/*
Ana carolina padron sandoval
*/

package mx.edu.utng.clientes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.edu.utng.clientes.model.Cliente;
import mx.edu.utng.clientes.util.UtilDB;


public class ClienteDAOImp implements ClienteDAO{

    private Connection connection;
    
    public ClienteDAOImp(){
        connection = UtilDB.getConnection();
    }
    
    @Override
    public void agregarCliente(Cliente cliente) {
        try {
          String query = "INSERT INTO clientes (nombre, domicilio, "
                  + " telefono, celular,correo) VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,cliente.getNombre());
            ps.setString(2, cliente.getDomicilio());
            ps.setInt(3, cliente.getTelefono());
            ps.setInt(4, cliente.getCelular());
            ps.setString(5, cliente.getCorreo());
            
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarCliente(int idCliente) {
        try {
             String query = "DELETE FROM clientes WHERE id_cliente = ?";
             PreparedStatement ps = connection.prepareStatement(query);
             ps.setInt(1, idCliente);
             ps.executeUpdate();
             ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarCliente(Cliente cliente) {
    try {
          String query = "UPDATE clientes SET nombre = ?, "
                  + " domicilio= ?, telefono=?, celular=?, correo=? WHERE "
                  + " id_cliente= ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDomicilio());
            ps.setInt(3, cliente.getTelefono());
            ps.setInt(4, cliente.getCelular());
            ps.setString(5, cliente.getCorreo());
            ps.setInt(6, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> desplegarClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try{
            if(connection!=null){
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");
            while (resultSet.next()) {
              Cliente cliente = new Cliente(
              resultSet.getInt("id_cliente"),
              resultSet.getString("nombre"),
              resultSet.getString("domicilio"),
              resultSet.getInt("telefono"),
              resultSet.getInt("celular"),
              resultSet.getString("correo"));
              clientes.add(cliente);
            }
            resultSet.close();
            statement.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public Cliente elegirCliente(int idCliente) {
       Cliente cliente = new Cliente();
        try{
        PreparedStatement statement = 
                connection.prepareStatement(
                        "SELECT * FROM clientes WHERE "
                                + " id_cliente = ?");
        statement.setInt(1, idCliente);
        ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
              cliente.setIdCliente(
                      resultSet.getInt("id_cliente"));
              cliente.setNombre(
                      resultSet.getString("nombre"));
              cliente.setDomicilio(
                      resultSet.getString("domicilio"));
              cliente.setTelefono(
                      resultSet.getInt("telefono"));
              cliente.setCelular(
                      resultSet.getInt("celular"));
               cliente.setCorreo(
                      resultSet.getString("correo"));
             
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cliente;
    }
    
    
}
