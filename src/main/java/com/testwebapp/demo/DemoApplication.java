package com.testwebapp.demo;

import com.testwebapp.demo.domain.Ingredient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Ingredient i = new Ingredient("desc",new BigDecimal(1),null,null);

	}

}
