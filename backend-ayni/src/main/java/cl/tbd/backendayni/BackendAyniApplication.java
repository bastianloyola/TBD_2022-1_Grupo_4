package cl.tbd.backendayni;

import java.io.*;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.web.bind.annotation.RestController;

import cl.tbd.backendayni.models.Tarea;
import cl.tbd.backendayni.repositories.TareaRepository;

@SpringBootApplication
@RestController
public class BackendAyniApplication implements CommandLineRunner {
	@Autowired
	private TareaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BackendAyniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// REFERENCIA
		/*
		repository.deleteAll();
		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		*/
		Date date = new Date();
		Tarea tarea = new Tarea("1", "Tarea 1", "Descripcion de la tarea 1", date, "Requerimientos de la tarea 1");
		repository.insertOneTarea(tarea);
		

	}

}