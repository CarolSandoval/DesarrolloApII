package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ensayo")

public class Ensayo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ensayo")
    private Long idEnsayo;
    @Column(name = "nombre_ensayo", length = 10)
    private String nombreEnsayo;
    @Column(length = 15)
    private String fecha;
    @Column(length = 15)
    private String calificacion;
    

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    public Ensayo(Long idEnsayo, String nombreEnsayo, String fecha, String calificacion, Alumno alumno) {
        super();
        this.idEnsayo = idEnsayo;
        this.nombreEnsayo = nombreEnsayo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.alumno = alumno;
    }

    public Ensayo() {
        this.idEnsayo = 0L;
    }

    
   

    public Long getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(Long idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getNombreEnsayo() {
        return nombreEnsayo;
    }

    public void setNombreEnsayo(String nombreEnsayo) {
        this.nombreEnsayo = nombreEnsayo;
    }

    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

}
