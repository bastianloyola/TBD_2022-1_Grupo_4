package cl.tbd.backendayni.repositories;

import cl.tbd.backendayni.models.Voluntario;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Interface para VoluntarioRepository
 */
public interface VoluntarioRepository extends MongoRepository<Voluntario, String>{
    
    public int countVoluntarios();
    public int newId();
    public List<Voluntario> getAll();
    public List<Voluntario> getVoluntarioLogin(String nombre, String password);
    public List<Voluntario> showVoluntarioById(long id);
    public Voluntario createVoluntario(Voluntario voluntario);
    public void deleteVoluntarioById(long id);
    public void updateVoluntario(Voluntario voluntario);

    
    //CRUD de Mongodb
    public Voluntario findByNombre(String nombre);
	public List<Voluntario> find();
	public Voluntario insertOneVoluntario(Voluntario voluntario);
	public Voluntario updVoluntario(Voluntario voluntario); 
	public void deleteVoluntario(String id);

}

