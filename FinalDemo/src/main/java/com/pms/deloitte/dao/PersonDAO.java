package com.pms.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pms.deloitte.model.Product;

@Repository
public interface PersonDAO extends CrudRepository<Product, Integer>
{
}
