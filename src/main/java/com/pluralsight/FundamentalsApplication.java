package com.pluralsight;

import com.pluralsight.entity.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FundamentalsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(FundamentalsApplication.class, args);
	}

}
