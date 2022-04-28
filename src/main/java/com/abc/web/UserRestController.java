package com.abc.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.service.UserService;

@RestController
@RequestMapping("online")
public class UserRestController {
	
	@Autowired
	UserService User;
	 @GetMapping("/home")
	 public String gethomePage() {
		return "Welcome to product stores";
		 
	 }
	
	
	

}
