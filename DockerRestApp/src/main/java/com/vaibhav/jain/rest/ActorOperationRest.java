package com.vaibhav.jain.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationRest {

	public ResponseEntity<String>showWishMessage(@PathVariable String name){
		return new ResponseEntity<String>("Good Morning"+name,HttpStatus.OK);
	}
}
