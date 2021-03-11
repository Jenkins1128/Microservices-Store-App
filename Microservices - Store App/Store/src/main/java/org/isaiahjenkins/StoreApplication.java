package org.isaiahjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The StoreApplication class runs the Spring Boot app.
 */
@SpringBootApplication
public class StoreApplication{

	/**
	 * Rest template. Spring will auto wire use this bean whenever we need a rest
	 * template object
	 *
	 * @return the rest template
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	/**
	 * The main method that runs Spring Boot app.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		SpringApplication.run(StoreApplication.class, args);
	}

}
