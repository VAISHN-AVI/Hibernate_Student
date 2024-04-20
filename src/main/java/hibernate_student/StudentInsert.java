package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentInsert {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(3);// always write new data
		student.setName("trupti");
		student.setMarks(70);
		student.setPhone(7776543222L);
		student.setAddress("karjat");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vaishnavi");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(student);
		transaction.commit();

	}
}
