package com.example.demo.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Person;
import com.example.demo.service.PersonImp;

@RestController
public class PersonContr {

	@Autowired
	private PersonImp personRepo;

	@GetMapping("api/name/{id}")
	public Person getname(@PathVariable("id") int id) throws Exception {

		return personRepo.selectUser(id);
	}
}
