package com.proyecto.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author grupo4
 *
 */
@SpringBootApplication
@EntityScan("com.proyecto.agenda.modelo")
@EnableJpaRepositories("com.proyecto.agenda.repositorio")
public class AgendaApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}
}
