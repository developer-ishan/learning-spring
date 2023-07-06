package com.developerishan.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	//default name of the bean is the name of the method
	@Bean
	public String name() {
		return "Ishan";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean 
	public Person person() {
		var person = new Person("Ishan", 21);
		return person;
	}
	
	@Bean(name = "address2") //change the name of the bean
	public Address address() {
		return new Address("MNNIT Malviya Hostel", "Prayagraj");
	}
	
}
