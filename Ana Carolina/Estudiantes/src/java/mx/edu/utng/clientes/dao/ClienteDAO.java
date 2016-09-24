
package mx.edu.utng.clientes.dao;

import java.util.List;
import mx.edu.utng.clientes.model.Cliente;
 
 
public interface ClienteDAO {
    void agregarCliente(Cliente cliente);
    void borrarCliente(int idCliente);
    void cambiarCliente(Cliente cliente);
    List<Cliente> desplegarClientes();
    Cliente elegirCliente(int idCliente);

}
