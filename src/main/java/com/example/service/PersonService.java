package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;
// add comment
@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("lklk");
		p.setLastName("A");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mahmoud");
		p.setLastName("Yousry");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(20);
		p.setFirstName("Makka");
		p.setLastName("tolba");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("fawzy");
		p.setLastName("tolba");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(30);
		p.setFirstName("ibrahim");
		p.setLastName("jamal");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

