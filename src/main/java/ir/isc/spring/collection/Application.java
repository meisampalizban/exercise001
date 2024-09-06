package ir.isc.spring.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.SQLException;

@SpringBootApplication
@EntityScan(basePackages = "ir.isc.spring.collection.model")
public class Application {
	public static void main(String[] args) throws Exception, SQLException{
		var Context = SpringApplication.run(Application.class,args);
		CollectionExercise colc=Context.getBean(CollectionExercise.class);
//		colc.createStudent();
//		colc.sorting();
		colc.averange();
		
	}
}
