package org.isaiahjenkins.apple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Apple application.
 */
@SpringBootApplication
public class AppleApplication {

	/**
	 * Rest template rest template.
	 *
	 * @return the rest template
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}

}
