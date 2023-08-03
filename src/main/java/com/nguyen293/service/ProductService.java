package com.nguyen293.service;

import java.util.List;
import java.util.Optional;

import com.nguyen293.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

}
