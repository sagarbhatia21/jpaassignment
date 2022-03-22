package petdemo;
import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Address;
import com.Customer;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerPU");
		EntityManager entitymanager = emf.createEntityManager();
		Address add = new Address();
		add.setCustomerAddress("23 Rajpur Road");
		
		
		Customer custo = new Customer();
	    custo.setCustomerName("Shivam");
	    custo.setCustomerEmail("s123@gmail.com");
	    custo.setCustomerAddress(add);
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(custo);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		Customer mycustomer = entitymanager.find(Customer.class, "Shivam");
		System.out.println(mycustomer.getCustomerName());
		System.out.println(mycustomer.getCustomerEmail());
		System.out.println(mycustomer.getCustomerAddress());
		
		
	}
}
