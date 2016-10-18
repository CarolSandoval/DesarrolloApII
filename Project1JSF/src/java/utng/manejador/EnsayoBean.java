package utng.manejador;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AlumnoDAO;
import utng.datos.EnsayoDAO;
import utng.modelo.Alumno;
import utng.modelo.Ensayo;

        
@ManagedBean(name = "ensayoBean")@SessionScoped
public class EnsayoBean implements  Serializable{
    private List<Ensayo> ensayos;
    private Ensayo ensayo;
    private List<Alumno> alumnos;
    public EnsayoBean(){
        ensayo = new Ensayo();
        ensayo.setAlumno(new Alumno());
    }

    public List<Ensayo> getEnsayos() {
        return ensayos;
    }

    public void setEnsayos(List<Ensayo> ensayos) {
        this.ensayos = ensayos;
    }

    public Ensayo getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(Ensayo ensayo) {
        this.ensayo = ensayo;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    
    public String listar(){
        EnsayoDAO dao = new EnsayoDAO();
        try{
            ensayos= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Ensayos";
        }
    public String eliminar(){
        EnsayoDAO dao = new EnsayoDAO();
        try{
            dao.delete(ensayo);
            ensayos = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
    
    
    public String iniciar(){
        
       ensayo = new Ensayo();
       ensayo.setAlumno(new Alumno());
       try{
           alumnos = new AlumnoDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
    public String guardar(){
        EnsayoDAO dao = new EnsayoDAO();
        try{ 
            if(ensayo.getIdEnsayo()!=0){
                dao.update(ensayo);
        }else{ dao.insert(ensayo);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        ensayos = dao.getAll();
        return "Guardar";
    }
    public String cancelar(){ return"Cancelar";}
    public String editar(Ensayo ensayo){
        this.ensayo = ensayo;
        try{
            alumnos = new AlumnoDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }

    
}
