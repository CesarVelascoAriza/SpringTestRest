package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

	@RequestMapping("/")
	public Person persona() {
		return new Person();
	}
	@RequestMapping(path="/add", method=RequestMethod.POST,
			headers="Accept-application/xml, Accept-application/json")
	public Person Addperson(@RequestBody(required=true) Person per) {
		List<Person> pe= new ArrayList<>();
		per.getId();
		per.getNombre();
		pe.add(per);
		System.out.println("per" + per.getId());
		return per;
		
	}
}
