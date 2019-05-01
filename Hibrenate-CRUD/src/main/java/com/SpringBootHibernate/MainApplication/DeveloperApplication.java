package com.SpringBootHibernate.MainApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DeveloperApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DeveloperApplication.class, args);
	}
}
