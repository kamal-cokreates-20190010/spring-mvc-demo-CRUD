package ckl.kamal.springdemo.service;


import java.util.List;


import ckl.kamal.springdemo.entity.Customer;

public interface CustomerService {


	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);


	

	
}
