package cl.tbd.backendayni;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstId(String id);
	public List<Customer> find();
	public Customer insertOneCustomer(Customer customer);
	public Customer updCustomer(Customer customer);
	public void deleteCustomer(String id);

}
