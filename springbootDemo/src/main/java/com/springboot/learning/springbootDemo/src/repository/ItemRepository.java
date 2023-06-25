package com.springboot.learning.springbootDemo.src.repository;

import com.springboot.learning.springbootDemo.src.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemModel, String> {
}
