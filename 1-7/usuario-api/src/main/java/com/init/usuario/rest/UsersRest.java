package com.init.usuario.rest;
import com.init.usuario.entitys.User;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.init.usuario.dao.UsersDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("users")
public class UsersRest {

	@Autowired
	private UsersDAO UsersDAO;

	@GetMapping
	public ResponseEntity<List<User>> getUSer(){
		List<User> users = UsersDAO.findAll();
		return ResponseEntity.ok(users);
	}

	@RequestMapping(value = "{userId}")
	public ResponseEntity<User> getUSerById(@PathVariable("userId") Long userId){
		try {
			Optional<User> optionalUser = UsersDAO.findById(userId);
			return ResponseEntity.ok(optionalUser.get());
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}
		/*
		if (optionalUser.isPresent()){
		} else {
			return ResponseEntity.noContent().build();
		}*/
	}

	@PostMapping 
	public ResponseEntity<User> createUser(@RequestBody User user){
		try {
			User newUser = UsersDAO.save(user);
			return ResponseEntity.ok(newUser);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}

	} 

	@DeleteMapping(value = "{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable("userId") Long userId){
		try {
			UsersDAO.deleteById(userId);
			return ResponseEntity.ok(null);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}

	}

	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user){
		try {
			Optional<User> optionalUser = UsersDAO.findById(user.getId());
			User updateUser = optionalUser.get();
			updateUser.setName(user.getName());
			updateUser.setEmail(user.getEmail());
			updateUser.setIdentification(user.getIdentification());
			updateUser.setPassword(user.getPassword());
			UsersDAO.save(updateUser);
			return ResponseEntity.ok(updateUser);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}
		/*if (optionalUser.isPresent()){
			User updateUser = optionalUser.get();
			updateUser.setName(user.getName());
			updateUser.setEmail(user.getEmail());
			updateUser.setIdentification(user.getIdentification());
			updateUser.setPassword(user.getPassword());
			UsersDAO.save(updateUser);
			return ResponseEntity.ok(updateUser);
		} else {
			return ResponseEntity.noContent().build();
		}*/
	}
}
