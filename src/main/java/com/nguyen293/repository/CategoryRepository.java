package com.nguyen293.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nguyen293.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String>{

}
