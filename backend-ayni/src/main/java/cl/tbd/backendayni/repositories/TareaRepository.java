package cl.tbd.backendayni.repositories;

import cl.tbd.backendayni.models.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

/*Interface para TareaRepository*/
public interface TareaRepository extends MongoRepository<Tarea, String>{
    // OJO, revisar si borrar
    //Funciones basicas de Tarea
    /*
    public int countTareas();
    public String newId();
    public List<Tarea> getAll();
    public List<Tarea> showTareaById(long id);
    public Tarea createTarea(Tarea tarea);
    public void updateTarea(Tarea tarea);
    public void deleteTareaById(long id);
    //Funcione Complementarias de Tarea
    public List<Tarea> getTareaByIdEmergencia(long id);
    //Requisitos
    public List<Tarea> getTareaByIdRegion(long id);
    */

    //CRUD de Mongodb
    public Tarea findByNombre(String nombre);
	public List<Tarea> find();
	public Tarea insertOneTarea(Tarea tarea);
	public Tarea updTarea(Tarea tarea); 
	public void deleteTarea(String id);
}
