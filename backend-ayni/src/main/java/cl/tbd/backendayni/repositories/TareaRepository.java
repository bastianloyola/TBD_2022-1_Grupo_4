package cl.tbd.backendayni.repositories;

import cl.tbd.backendayni.models.Tarea;
import java.util.List;

/*Interface para TareaRepository*/
public interface TareaRepository extends MongoRepository<Tarea, String> {

    // CRUD de Mongodb
    List<Tarea> findAll();

    Optional<Tarea> findById(String id);

    Tarea save(Tarea tarea);

    void delete(Tarea tarea);
}
