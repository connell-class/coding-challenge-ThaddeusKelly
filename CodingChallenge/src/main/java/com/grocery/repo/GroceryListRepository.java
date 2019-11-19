package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.GroceryList;

@Repository
public interface GroceryListRepository extends JpaRepository<GroceryList, Integer> {

}
