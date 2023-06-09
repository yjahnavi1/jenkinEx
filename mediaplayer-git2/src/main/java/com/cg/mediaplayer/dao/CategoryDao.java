package com.cg.mediaplayer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mediaplayer.entity.Category;


@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>{
	public Category findByCategoryName(String CategoryName);
}