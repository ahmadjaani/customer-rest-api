package com.mycompany.springbootproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner {

	public static List<String> list ;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		list = Arrays.asList("aman","ankit","abhishek", "aritya", "amit");
	}

//	@GetMapping
//	public List<String> getNames(){
//		return  list.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
//	}
//
//	@GetMapping("/{name}")
//	public String greetings(@PathVariable String name){
//		return "<h1 style='color: solidorange;'>Welcome, <strong>"+name.toUpperCase()+"</strong></h1>";
//	}
}
