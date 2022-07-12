package cl.tbd.backendayni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import cl.tbd.backendayni.models.Tarea;
import cl.tbd.backendayni.models.Voluntario;
import cl.tbd.backendayni.repositories.Dump;
import cl.tbd.backendayni.repositories.TareaRepository;
import cl.tbd.backendayni.repositories.VoluntarioRepository;

@SpringBootApplication
@RestController
public class BackendAyniApplication implements CommandLineRunner {
	@Autowired
	private TareaRepository repositoryTarea;
	@Autowired
	private VoluntarioRepository repositoryVoluntario;

	public static void main(String[] args) {
		SpringApplication.run(BackendAyniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repositoryTarea.deleteAll();
		// get today date as string
		repositoryTarea.save(new Tarea("Tarea 1", "Descripcion 1", "Estado 1", null, "Voluntario 1", "Voluntario 2",
				"Voluntario 3"));
		repositoryTarea.save(new Tarea("Tarea 2", "Descripcion 2", "Estado 2", null, "Voluntario 1", "Voluntario 2",
				"Voluntario 3"));
		repositoryTarea.save(new Tarea("Tarea 3", "Descripcion 3", "Estado 3", null, "Voluntario 1", "Voluntario 2",
				"Voluntario 3"));
		repositoryTarea.save(new Tarea("Tarea 4", "Descripcion 4", "Estado 4", null, "Voluntario 1", "Voluntario 2",
				"Voluntario 3"));
		repositoryTarea.save(new Tarea("Tarea 5", "Descripcion 5", "Estado 5", null, "Voluntario 1", "Voluntario 2",
				"Voluntario 3"));

		repositoryVoluntario.deleteAll();
		repositoryVoluntario.save(new Voluntario("correo1", "usuario1", "nombre1", "password1", "atributos1"));
		repositoryVoluntario.save(new Voluntario("correo2", "usuario2", "nombre2", "password2", "atributos2"));
		repositoryVoluntario.save(new Voluntario("correo3", "usuario3", "nombre3", "password3", "atributos3"));
		repositoryVoluntario.save(new Voluntario("correo4", "usuario4", "nombre4", "password4", "atributos4"));

	}

}