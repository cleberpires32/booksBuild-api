package com.cleber.booksBuildapi.config;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

	//@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instanciaBD() {
		//if(strategy.equals("create")) {
			Logger logger = Logger.getLogger("br.com.MinhaClasse");
			logger.info("Criação de banco via SQL strategy DEV:'${strategy}'");
			
		return true;
		//}else {
		//	return false;
		//}
	}
	
	
}
