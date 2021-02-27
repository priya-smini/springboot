package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		//without getBean object created because singleton design pattern
		Alien a = context.getBean(Alien.class);
		a.show();
		
//		//object will be created only once
//		Alien a1 = context.getBean(Alien.class);
//		a1.show();
	}

}
