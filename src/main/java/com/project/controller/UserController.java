package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.User;
import com.project.repositry.UserRepositry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepositry userrepo;
	
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		
		User a = userrepo.save(user);
		return a ;
}
	@GetMapping("/getuser")
	public List<User> getUser()
	{
		List<User> b = userrepo.findAll();
		return b;
	}
	
	

}
