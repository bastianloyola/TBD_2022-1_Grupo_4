package cl.tbd.backendayni.repositories;

import cl.tbd.backendayni.models.Tarea;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

/*Interface para TareaRepository*/
public interface TareaRepository extends MongoRepository<Tarea, String> {

    public Tarea findByNombre(String nombre);
}
