package com.minhaApiWeb.demo.Configurantions;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaApiWeb.demo.entities.User;
import com.minhaApiWeb.demo.entities.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	//tudo no método run será executado quando a aplicação rodar.
	@Override
	public void run(String... args) throws Exception {
		//id nulo pois sera gerado pelo BD
		User u1 = new User(null, "Alice Ferreira", "alica@email.com", "888888888", "9001222");
		User u2 = new User(null, "Marcio Araujo", "marcio@email.com", "777777777", "1234321");
		User u3 = new User(null, "Alex Da Silva", "silva@email.com", "111111888", "91230433");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		
	}
	
	
}
