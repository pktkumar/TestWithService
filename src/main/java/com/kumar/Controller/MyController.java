package com.kumar.Controller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import com.kumar.Service.MyService;
import com.kumar.Util.Person;

@RestController
public class MyController {
	
	
	
	@Autowired
	MyService myService;
	
	@RequestMapping(value ="/",method= RequestMethod.GET)
	public String SelectNumber() {
				return myService.getResult("Kumar Vaduganthan");
				
	}
	
	@RequestMapping(value = "/Id" ,method= RequestMethod.GET,produces = "application/json")
    public Stream<Person> getById(@RequestParam int Id ){
		
		return myService.getById(Id);
	}
	
	   @Bean
	    public Docket swaggerApi() {

		   return new Docket(DocumentationType.SWAGGER_2)
		  		                   .select()
		                   .apis(RequestHandlerSelectors.basePackage("com.kumar.Controller"))
		                   .paths(PathSelectors.any())
		                   .build();
	   }
	   
	   
//added for swagger Test	   
	   @RequestMapping(value = "/Test")
	   public String testValue(){
		   
		   return"no value";
	   }
	   
	   
}
