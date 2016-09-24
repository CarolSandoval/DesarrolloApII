
package mx.edu.utng.clientes.model;



public class Cliente {
   private int idCliente;
   private String nombre;
   private String domicilio;
   private int telefono;
   private int celular;
   private String correo;

   public Cliente() {
        this(0,"","",0,0,"");
    }

    public Cliente(int idCliente, String nombre, String domicilio, int telefono, int celular, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
    }



    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

  
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
      @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo + '}';
    }
    
}
   