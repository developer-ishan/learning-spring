package com.developerishan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.developerishan.learnspringframework.game.GameRunner;
import com.developerishan.learnspringframework.game.MarioGame;
import com.developerishan.learnspringframework.game.PacmanGame;
import com.developerishan.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want Spring to manage- @Configuartion
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		//using the type of the bean to retrieve the object
		System.out.println(context.getBean(Address.class));
	}

}
