package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.GroceryList;
import com.grocery.repo.GroceryListRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/list")
public class GroceryListController {
	@Autowired
	private GroceryListRepository glr;
	
	public GroceryListRepository getRepo() {
		return glr;
	}
	@Autowired
	public void setRepo(GroceryListRepository glr) {
		this.glr=glr;
	}
	@PostMapping("/save")
	public String save(@RequestBody GroceryList list) {
		try {
			glr.save(list);
			return "Saved";
		}catch (Exception e) {
			return "Not Saved";
		}
	}
	@GetMapping("/getAll")
	public List<GroceryList> getAll(){
		return glr.findAll();
	}
}
