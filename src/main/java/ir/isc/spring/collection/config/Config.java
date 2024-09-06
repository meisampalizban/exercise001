package ir.isc.spring.collection.config;

import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	@Bean
	PhysicalNamingStrategy physical() {
		return new PhysicalNamingStrategyStandardImpl();
	}
	
	@Bean
	ImplicitNamingStrategy implicit() {
		return new ImplicitNamingStrategyJpaCompliantImpl();
	}
}

