package com.abc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.entity.Plant;
import com.abc.exception.UserNotFoundException;
import com.abc.repository.PlantRepository;

import com.abc.service.PlantService;

@Service
public class PlantServiceImpl implements PlantService{
	
	@Autowired
	Plant hotelAccountRepository;

	@Override
	public String login(String username, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Plant> getAllPlant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertPlant(Plant a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Plant getPlant(int pId) {
		// TODO Auto-generated method stub
		return null;
	}
}
	