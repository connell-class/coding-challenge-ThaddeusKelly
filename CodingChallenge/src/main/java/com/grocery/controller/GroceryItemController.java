package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.GroceryItem;
import com.grocery.repo.GroceryItemRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/item")
public class GroceryItemController {
	@Autowired
	private GroceryItemRepository gir;
	
	public GroceryItemRepository getRepo() {
		return gir;
	}
	@Autowired
	public void setRepo(GroceryItemRepository gir) {
		this.gir=gir;
	}
	@PostMapping("/save")
	public String save(@RequestBody GroceryItem item) {
		try {
			gir.save(item);
			return "Saved";
		}catch (Exception e) {
			return "Not Saved";
		}
	}
	@GetMapping("/getAll")
	public List<GroceryItem> getAll(){
		return gir.findAll();
	}
}
