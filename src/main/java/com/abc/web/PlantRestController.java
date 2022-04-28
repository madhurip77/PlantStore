package com.abc.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Plant;
import com.abc.service.PlantService;


@RestController
@RequestMapping("/orders")
public class PlantRestController {
	@Autowired
	PlantService orderservice;

	public PlantRestController() {
		super();
		
		System.out.println("-----Inside Product Constructor");
	}
	
	@GetMapping("/allplants")
	public List<Plant> getallPlantDetails()
	{
		return orderservice.getAllPlant();
	}
	
}
