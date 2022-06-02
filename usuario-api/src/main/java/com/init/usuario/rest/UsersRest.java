package com.init.usuario.rest;
import com.init.usuario.entitys.User;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("users")

public class UsersRest {

	@GetMapping
	public ResponseEntity<List<User>> getUSer(){
		User user1 = new User(1, "Antony", "1234", "0987654321", "amaciasr@pichincha.com");
		User user2 = new User(2, "Patricio", "1234", "0987654321", "pat@hotmail.com");
		User user3 = new User(3, "Adam", "1234", "0987654321", "adam@hotmail.com");
		List<User> users = new List();
		return ResponseEntity.ok([user1, user2, user3]);
	}
}
