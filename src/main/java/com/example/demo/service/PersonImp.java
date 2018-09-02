package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.Person;
import com.example.demo.PersonRepo;

@Service
public class PersonImp implements PersonBo {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public Person createUser(Person person) throws Exception {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

	@Override
	public Person updateUser(Person person) throws Exception {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

	@Override
	public void deleteUser(Person person) throws Exception {
		// TODO Auto-generated method stub
		personRepo.delete(person);
		;
	}

	@Cacheable(value = "rakibCacheIs", key = "#id", unless = "#result==null")
	@Override
	public Person selectUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return personRepo.findOne(id);
	}

	@Override
	public List<Person> selectAllUser() throws Exception {
		// TODO Auto-generated method stub
		return (List<Person>) personRepo.findAll();
	}

}
