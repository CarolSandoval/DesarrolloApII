package utng.modelo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name= "alumno")
public class Alumno  implements Serializable{
    @Id
    @GeneratedValue(
            strategy =GenerationType.IDENTITY)
    
    @Column(name = "id_alumno")
    private Long idAlumno;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String apellido;
    @Column(length = 30)
      private String direccion;
    @Column(length = 30)
    private String telefono;
    
    
    
    public Alumno(){
        this.idAlumno= 0L;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
   
    
    }

   
    
    
    
    
    
        
    
    

