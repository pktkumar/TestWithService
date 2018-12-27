package com.kumar.KumarTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.kumar")
@EnableSwagger2
public class KumarTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KumarTestApplication.class, args);
	}

}

