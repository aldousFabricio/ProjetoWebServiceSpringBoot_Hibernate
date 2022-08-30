package com.aldousCavalcanti.SpringBootJPAHibernate.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aldousCavalcanti.SpringBootJPAHibernate.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Fabricio", "fabricio@gmail.com", "98982321", "SuperMario");
		return ResponseEntity.ok().body(u);
	}

}
