package mx.edu.utng.clientes.model;

public class Estudiante {
   private int idEstudiante;
   private String nombre;
   private String apellidos;
   private String curso;
   private int anio;

   public Estudiante() {
        this(0,"","","",0);
    }
    
    public Estudiante(int idEstudiante, String nombre, String apellidos, String curso, int anio) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.anio = anio;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", anio=" + anio + '}';
    }
}
