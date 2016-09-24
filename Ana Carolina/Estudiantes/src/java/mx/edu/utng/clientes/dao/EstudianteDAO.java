package mx.edu.utng.clientes.dao;

import java.util.List;
import mx.edu.utng.clientes.model.Estudiante;

public interface EstudianteDAO {
    void agregarEstudiante(Estudiante estudiante);
    void borrarEstudiante(int idEstudiante);
    void cambiarEstudiante(Estudiante estudiante);
    List<Estudiante> desplegarEstudiantes();
    Estudiante elegirEstudiante(int idEstudiante);

}
