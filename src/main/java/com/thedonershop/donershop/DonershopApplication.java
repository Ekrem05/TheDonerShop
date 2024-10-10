package com.thedonershop.donershop;

import com.thedonershop.donershop.model.entity.Product;
import com.thedonershop.donershop.service.contracts.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DonershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonershopApplication.class, args);
	}

	@Bean
	public static CommandLineRunner runner(ProductService productService){

		return (args) -> {
			productService.add(new Product("Doner",14.2));
		};
	}

}
