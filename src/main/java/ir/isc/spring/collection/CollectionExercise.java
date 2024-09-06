package ir.isc.spring.collection;

import ir.isc.spring.collection.model.Address;
import ir.isc.spring.collection.model.Students;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CollectionExercise {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void createStudent(){
		entityManager = entityManager.getEntityManagerFactory().createEntityManager();
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();

		Students st = new Students();
		Address address = new Address();
		transaction.begin();
		st.setFirstName("ali");
		st.setLastName("palizban");
		st.setAge(24);
		st.setGrade(20);
		// insert student address
		address.setCountry("iran");
		address.setCity("tehran");
		address.setStreet("shahran");
		st.setAddress(address);
		session.persist(st);
		transaction.commit();
		entityManager.close();
		
		transaction.begin();
		Students st = new Students("mona","rostami",18,10,new Address("tehran","iran","azadi st"));
		session.persist(st);
		transaction.commit();
		entityManager.close();
	}
	
	public void sorting(){
		entityManager = entityManager.getEntityManagerFactory().createEntityManager();
		List<Students> students = entityManager.createQuery("SELECT s FROM Students AS s",Students.class).getResultList();
		//sort by student age
		Collections.sort(students);
		for(Students stu: students){
			System.out.println(stu.getAge()+"/*/"+stu.getFirstName());
		}
		// reverse sort by student age
		Collections.reverse(students);
		for(Students stu2: students){
			System.out.println(stu2.getAge()+"/*/"+stu2.getFirstName());
		}
		
		find user with name meisam
		for(Students s : students){
			if(s.getFirstName().equals("meisam")){
				System.out.println("find");
				break;
			}
		}
		
		
		
		// sort student by age
		Collections.sort(students,new Comparator<Students>() {
			@Override
			public int compare(Students o1,Students o2){
				if (o1.getGrade() > o2.getGrade()) {
					return -1;
				}
				if (o1.getGrade() < o2.getGrade()) {
					return 1;
				}
				return 0;
				
			}
		});
		
		for(Students stu3 : students){
			System.out.println(stu3.getGrade() + "/*/" + stu3.getFirstName());
		}


		int i = Collections.binarySearch(students,students.get(2));
		System.out.println(i);
		System.out.println( students.get(i).getId() + students.get(i).getFirstName());
	}
	
	public void averange(){
		entityManager = entityManager.getEntityManagerFactory().createEntityManager();
		List<Students> students = entityManager.createQuery("SELECT s FROM Students AS s",Students.class).getResultList();
		List<Double> avg=new ArrayList<>();
		for(Students s:students){
			 avg.add((double)s.getGrade());
		}
		
//		var result = avg.stream().mapToDouble((Double)->Double.doubleValue()).average();
		var result = avg.stream().mapToDouble(Double::doubleValue).average();
		System.out.println(result);
	}
	
	
}
