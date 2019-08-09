package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pms.deloitte.model.Product;


public interface PersonService {

	public void addPerson(Product p);
	public void updatePerson(Product p);
	public List<Product> listPersons();
	public Product getPersonById(Integer  id);
	public void removePerson(int id);
	
}
