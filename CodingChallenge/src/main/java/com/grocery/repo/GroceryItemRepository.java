package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.GroceryItem;

@Repository
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Integer> {

}
