package com.minhaApiWeb.demo.Configurantions;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaApiWeb.demo.entities.Order;
import com.minhaApiWeb.demo.entities.User;
import com.minhaApiWeb.demo.entities.repositories.OrderRepository;
import com.minhaApiWeb.demo.entities.repositories.UserRepository;
import com.minhaApiWeb.demo.enums.OrderStatus;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	//tudo no método run será executado quando a aplicação rodar.
	@Override
	public void run(String... args) throws Exception {
		//id nulo pois sera gerado pelo BD
		User u1 = new User(null, "Alice Ferreira", "alica@email.com", "888888888", "9001222");
		User u2 = new User(null, "Marcio Araujo", "marcio@email.com", "777777777", "1234321");
		User u3 = new User(null, "Alex Da Silva", "silva@email.com", "111111888", "91230433");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID,u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED,u3);
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		
	}
	
	
}
