package com.abc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.repository.UserDetailsRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDetailsRepository udr;
	@Override
	public String login(String userName,String Password) {
		// TODO Auto-generated method stub
		return null;
	}

}

