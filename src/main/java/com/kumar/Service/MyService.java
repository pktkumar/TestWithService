package com.kumar.Service;

import java.util.ArrayList;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import com.kumar.Util.Person;

@Service
public class MyService {
	
	
	
	public String getResult(String str){
		
		return "this from service";
	}
	
	
	public Stream<Person> getById(int val){
		
		ArrayList<Person> arrayList =new  ArrayList<Person>();
		
		arrayList.add(new Person("Kumar", 41,"Chennai"));
		arrayList.add(new Person("Vaduganathan", 100,"Pattukottai"));
		
		return (Stream<Person>) arrayList.stream().filter(p -> p.getAge() == val);
	}
}
