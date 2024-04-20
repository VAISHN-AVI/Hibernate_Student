package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class StudentFind {
public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("vaishnavi");
		EntityManager manager=factory.createEntityManager();
		
		Student employee=manager.find(Student.class,9);
		if(employee !=null)
		{
			System.out.println(employee);
		}
		else {
			System.out.println(" ID NOT FOUND !!!!");
		}
	}


}
