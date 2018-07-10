package com.proyecto.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author grupo4
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.proyecto.agenda")
@EntityScan(basePackages = "com.proyecto.agenda.modelo")
@EnableJpaRepositories(basePackages = "com.proyecto.agenda.repositorio")
public class AgendaApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}
}
