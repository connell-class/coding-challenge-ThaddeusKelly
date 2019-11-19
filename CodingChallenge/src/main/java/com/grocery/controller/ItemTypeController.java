package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.ItemType;
import com.grocery.repo.ItemTypeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/type")
public class ItemTypeController {
	@Autowired
	private ItemTypeRepository itr;
	
	public ItemTypeRepository getRepo() {
		return itr;
	}
	@Autowired
	public void setRepo(ItemTypeRepository itr) {
		this.itr=itr;
	}
	@PostMapping("/save")
	public String save(@RequestBody ItemType type) {
		try {
			itr.save(type);
			return "Saved";
		}catch (Exception e) {
			return "Not Saved";
		}
	}
	@GetMapping("/getAll")
	public List<ItemType> getAll(){
		return itr.findAll();
	}
}
