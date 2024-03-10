package com.manager.demo1.contoller;


import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.demo1.exception.ResourceNotFoundException;
import com.manager.demo1.repository.Registerrepository;

import com.manager.demo1.modal.Register;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class Registercontroller {
	@Autowired	
	private Registerrepository registerrepository;

	// get all Members
	@GetMapping("/User")
	public ResponseEntity< List<Register>> getUserService() {
		List<Register>users = registerrepository.findAll();
		return ResponseEntity.ok(users);
	}

	// we are creating a student posting details
	@PostMapping("/User/create")
	public  ResponseEntity <Register> createService(@RequestBody Register register) {
		System.out.println("this data is being posted"+register);
		
		Register savedRegister = registerrepository.save(register);
		return new ResponseEntity<>(savedRegister,HttpStatus.CREATED);
	}
}
