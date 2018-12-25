package com.kumar.Controller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.Service.MyService;
import com.kumar.Util.Person;

@RestController
public class MyController {
	
	
	
	@Autowired
	MyService myService;
	
	@RequestMapping("/")
	public String SelectNumber() {
				return myService.getResult("Kumar Vaduganthan");
				
	}
	
	@RequestMapping("/Id")
    public Stream<Person> getById(@RequestParam int Id ){
		
		return myService.getById(Id);
	}
}
