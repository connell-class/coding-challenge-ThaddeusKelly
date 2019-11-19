package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.ItemType;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {

}
