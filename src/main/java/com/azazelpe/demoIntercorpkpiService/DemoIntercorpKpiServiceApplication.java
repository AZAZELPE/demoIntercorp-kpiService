package com.azazelpe.demoIntercorpkpiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoIntercorpKpiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntercorpKpiServiceApplication.class, args);
	}

}
