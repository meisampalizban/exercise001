package ir.isc.spring.jspform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EntityScan(basePackages = "ir.isc.spring.collection.model")
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
