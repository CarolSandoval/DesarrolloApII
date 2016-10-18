package utng.datos;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import utng.modelo.Ensayo;


public class EnsayoDAO extends DAO<Ensayo>{
    public EnsayoDAO(){
        super (new Ensayo());
    }
    
    public Ensayo getOneById(Ensayo ensayo)
            throws HibernateException{
        return super.getOneById(ensayo.getIdEnsayo());
    }
    
    
}
