
package utng.manejador;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AlumnoDAO;
import utng.modelo.Alumno;


@ManagedBean @SessionScoped
public class AlumnoBean  implements Serializable{
private List<Alumno> alumnos;
private Alumno alumno;

public AlumnoBean(){
}

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    

    public String listar(){
        AlumnoDAO dao =new AlumnoDAO();
        try{
            alumnos= dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Alumnos";
    }
    public String eliminar(){
        AlumnoDAO dao = new AlumnoDAO();
        try{
            dao.delete(alumno);
            alumnos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
    public String iniciar(){
        alumno = new Alumno();
        return "Iniciar";
           
    }
    public String guardar(){
        AlumnoDAO dao = new AlumnoDAO();
        try{
            if(alumno.getIdAlumno()!=0){
                dao.update(alumno);
            }else{
                dao.insert(alumno);
            }
            alumnos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Alumno alumno){
        this.alumno = alumno;
        return "Editar";
            }
        }
  