package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.PersonImp;

@EnableEurekaClient
@EnableCaching
@SpringBootApplication
public class SpringdatarestApplication {

	@Autowired
	private PersonImp personRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd() {
		return args -> {
			personRepo.createUser(new Person(1, "Rakib", "20"));
			personRepo.createUser(new Person(2, "Sakib", "21"));
			personRepo.createUser(new Person(3, "Nokib", "22"));
			personRepo.createUser(new Person(4, "Akib", "23"));
			personRepo.createUser(new Person(5, "Nakib", "25"));
			personRepo.createUser(new Person(6, "Sojib", "28"));
			personRepo.createUser(new Person(7, "Riaz", "30"));

		};

	}
/*
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("rakibCacheIs");
	}*/

}
