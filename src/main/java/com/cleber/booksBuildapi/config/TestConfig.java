package com.cleber.booksBuildapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

	//@Autowired
	//private DbService dbService;

	@Bean
	public void instaciaBaseDeDados() {
		//this.dbService.instanciaBaseDeDados();
	}

}
