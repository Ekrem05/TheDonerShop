package com.thedonershop.donershop;

import com.thedonershop.donershop.model.entity.product.Category;
import com.thedonershop.donershop.model.entity.product.Ingredient;
import com.thedonershop.donershop.model.entity.product.Product;
import com.thedonershop.donershop.model.entity.product.Serving;
import com.thedonershop.donershop.service.contracts.CategoryService;
import com.thedonershop.donershop.service.contracts.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DonershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonershopApplication.class, args);
	}

	@Bean
	public static CommandLineRunner runner(ProductService productService, CategoryService categoryService) {

		return (args) -> {
			//categoryService.add(new Category("Food"));
			Category category = categoryService.findById("6707920ada70ba4c76483a3b");
			System.out.println(category.getName());
			productService.add(new Product("Doner",
					"The best Doner in town",
					14.2,
					category,new ArrayList<>(
							List.of(
									new Serving("Small",0),
									new Serving("Medium",1),
									new Serving("Large",3)))
			,new ArrayList<>(
					List.of(
							new Ingredient("Bread",true),
							new Ingredient("Meat",false),
							new Ingredient("Onions",false),
							new Ingredient("Pepper",false),
							new Ingredient("Fried Potato",false),
							new Ingredient("Cucumber",false),
							new Ingredient("Tomato",false),
							new Ingredient("Ketchup",false),
							new Ingredient("Mayonnaise",false),
							new Ingredient("Hot sauce",false)))));
		};
	}

}
