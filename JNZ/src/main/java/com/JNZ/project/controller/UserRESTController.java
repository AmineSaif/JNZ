package com.JNZ.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.JNZ.project.dto.UserDTO;
import com.JNZ.project.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserRESTController {
	@Autowired
	UserService userService;
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public UserDTO getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
	
	@RequestMapping(path="/adduser",method = RequestMethod.POST)
	public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }
	@RequestMapping(path="updateuser",method = RequestMethod.PUT)
	public UserDTO updateUser(@RequestBody UserDTO user) {
        return userService.updateUser(user);
    }
	
	@RequestMapping(value="/deluser/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

	
}