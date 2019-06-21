package com.glen.GetBookListMicroService4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.glen.GetBookListMicroService4.sherbim.Busines;

//@EnableCircuitBreaker
@RestController
public class Kontrollor {

	@Autowired
	private Busines busines;
	
	
	@PostMapping("/economy/{isbn}")
	public void economy(@PathVariable(name="isbn") int isbn ) {
		
		busines.economy( isbn);
	}
	
	

	
}
