package petdemo;
import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.PassengerId;
import com.Passenger;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetPU");
		EntityManager entitymanager = emf.createEntityManager();
		
		PassengerId pid = new PassengerId();
		pid.setPassengerEmail("kidharvinodh198@gmail.com");
		pid.setPassengerMobile(9283391839l);
		
		Passenger pass = new Passenger();
		pass.setPassengerEmail(pid.getPassengerEmail());
		pass.setPassengerMobile(pid.getPassengerMobile());
		pass.setPassengerName("Vinodh Kumar");
		pass.setSource("Tanuku");
		pass.setDestination("Samalarkot");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pass);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		
		
	}
}