package cl.tbd.backendayni;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

import cl.tbd.backendayni.repositories.Dump;

@SpringBootApplication
@RestController
public class BackendAyniApplication implements CommandLineRunner {
	static Dump dump;

	public static void main(String[] args) {
		SpringApplication.run(BackendAyniApplication.class, args);
		dump = new Dump();
		dump.crearTablas();

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}