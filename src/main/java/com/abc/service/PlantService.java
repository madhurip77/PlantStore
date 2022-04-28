package com.abc.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.abc.entity.Plant;
import com.abc.exception.UserNotFoundException;

@Service

public interface PlantService 
{
	public String login(String username,String password) throws UserNotFoundException;

	public boolean logout(String username);
	public List<Plant> getAllPlant();
	public boolean insertPlant(Plant a);
	public Plant getPlant(int pId);
	
}



