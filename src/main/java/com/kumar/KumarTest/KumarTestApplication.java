package com.kumar.KumarTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kumar")
public class KumarTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KumarTestApplication.class, args);
	}

}

