package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class Studentdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void save(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public Student fetch(String email) {
		List<Student> list = entityManager.createQuery("select x from Student x where email=?1").setParameter(1, email)
				.getResultList();
		if (list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public Student fetch(long mobile) {
		List<Student> list = entityManager.createQuery("select x from Student x where mobile=?1")
				.setParameter(1, mobile).getResultList();
		if (list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<Student> fetch() {
		List<Student> list = entityManager.createQuery("select x from Student x").getResultList();
		return list;
	}

	public void delete(int id) {
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Student.class, id));
		entityTransaction.commit();

	}
	
	public Student fetch(int id)
	{
		return entityManager.find(Student.class, id);
	}
	
	public void update(Student student) {
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
// boiler plate code- generating multiple methods but with some changes like
// getters and setter and tostring()
// outline- gives all the methods variables int he class
// @Getter- generate getters for all, @Setter- generates setters
// @Data- creates both getters and setters also toString(), equals(),
// noargsconstructor()
// present in lombok repository

// to use @Data we should have java to check go to cmd and type java.

/*
 * after @data it will not come directly, there is a onetime step - to do that
 * go to lombok download-> 1st link and click on download botton(1.900kb) - a
 * jar will be downloaded - double click-> then specify location paste the
 * location and type (\eclipse.exe) and select. - to find location go to
 * properties of eclipse - then clickon install/update, quit installer then
 * restart the eclipse. - or if opening in zip -- in that download folder in the
 * search bar - type cmd type java -jar lo and tab then enter
 */
