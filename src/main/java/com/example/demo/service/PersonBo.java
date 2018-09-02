package com.example.demo.service;

import java.util.List;

import com.example.demo.Person;

public interface PersonBo {

	public Person createUser(Person person) throws Exception;

	public Person updateUser(Person person) throws Exception;

	public void deleteUser(Person person) throws Exception;

	public Person selectUser(int id) throws Exception;

	public List<Person> selectAllUser() throws Exception;
}
