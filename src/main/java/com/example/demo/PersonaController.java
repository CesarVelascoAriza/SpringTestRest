package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

	@RequestMapping("/")
	public Person persona() {
		return new Person();
	}
	///@RequestMapping
	@PostMapping(path="/add")
	public Person Addperson(@RequestBody Person per) {
		List<Person> pe= new ArrayList<>();
		per.getId();
		per.getNombre();
		pe.add(per);
		System.out.println("per" + per.getId());
		return per;
		
	}
}
