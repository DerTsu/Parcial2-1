package com.co.orteguitauwu.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.orteguitauwu.common.usuario.models.entity","com.co.orteguitauwu.curso.models.entity", "com.co.orteguitauwu.examen.models.entity"})
@EnableJpaRepositories({"com.co.orteguitauwu.common.usuario.models.entity","com.co.orteguitauwu.curso.models.entity","com.co.orteguitauwu.examen.models.entity"})
@EntityScan({"com.co.orteguitauwu.common.usuario.models.entity","com.co.orteguitauwu.curso.models.entity", "com.co.orteguitauwu.examen.models.entity"})
public class ExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenesApplication.class, args);
	}

}
