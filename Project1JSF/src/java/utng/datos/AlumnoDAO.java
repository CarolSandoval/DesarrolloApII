
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Alumno;


public class AlumnoDAO extends DAO<Alumno>{
    public AlumnoDAO(){
        super(new Alumno());
    }
    
    public Alumno getOneById(Alumno alumno)
            throws HibernateException{
        return super.getOneById(alumno.getIdAlumno());
    }
}
