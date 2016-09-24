package mx.edu.utng.clientes.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.utng.clientes.dao.ClienteDAOImp;
import mx.edu.utng.clientes.model.Cliente;
import mx.edu.utng.clientes.dao.ClienteDAO;
public class ClienteController extends HttpServlet {
  
    private static final String
           LISTA_CLIENTES = "/lista_clientes.jsp";
   private static final String 
           AGREGAR_O_MODIFICAR = "Cliente.jsp";
   private ClienteDAO dao;
   
   public ClienteController(){
       dao = new ClienteDAOImp();
   }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("borrar")){
            forward = LISTA_CLIENTES;
            int idCliente = Integer.parseInt(
                request.getParameter("idCliente"));
            dao.borrarCliente(idCliente);
            request.setAttribute("clientes",
                    dao.desplegarClientes());
            
         }else if(action.equalsIgnoreCase("cambiar")){
             forward = AGREGAR_O_MODIFICAR;
             int idCliente = Integer.parseInt(
                request.getParameter("idCliente"));
             Cliente cliente = 
                     dao.elegirCliente(idCliente);
             request.setAttribute("cliente", cliente);
             
         } else if(action.equalsIgnoreCase("agregar")){
             
             forward = AGREGAR_O_MODIFICAR;
             System.out.println(forward);
         } else{
             forward = LISTA_CLIENTES;
             request.setAttribute("clientes", 
                     dao.desplegarClientes());
         }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNombre(request.getParameter("nombre"));
        cliente.setDomicilio(request.getParameter("domicilio"));
        cliente.setTelefono(Integer.parseInt(
                request.getParameter("telefono")));
        cliente.setCelular(Integer.parseInt(
                request.getParameter("celular")));
        cliente.setCorreo(request.getParameter("correo"));
        String idCliente = request.getParameter("idCliente");
        
        if(idCliente==null|| idCliente.isEmpty()|| idCliente.trim().equals("")){
            dao.agregarCliente(cliente);
        }else{
            cliente.setIdCliente(Integer.parseInt(idCliente));
            dao.cambiarCliente(cliente);
        }
        RequestDispatcher view = 
                request.getRequestDispatcher(LISTA_CLIENTES);
        request.setAttribute("clientes", 
                dao.desplegarClientes());
        view.forward(request, response);
    }
}
