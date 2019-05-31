package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormularioController {

	private List<FormularioDTO> formulario = new ArrayList<>();
	private FormularioDTO formularioDTO;
	private Person persona;
	
	
	@RequestMapping("/formulario")
	public List<FormularioDTO> getallFormularios(){
		return formulario;
	}
	@PostMapping(path= "/formulario")
	public FormularioDTO setFormulario(@RequestBody FormularioDTO f) {
		formularioDTO = new FormularioDTO();
		formularioDTO.setFechaRegistro(f.getFechaRegistro());
		formularioDTO.setHoraRegistro(f.getFechaRegistro());
		formularioDTO.setEntidad(f.getEntidad());
		formularioDTO.setPersona(getPerson(f.getPersona()));
		formulario.add(formularioDTO);
		
		return f;
	}
	
	
	
	private Person getPerson(Person p) {
		persona = new Person();
		persona.setNumeroCedula(p.getNumeroCedula());
		persona.setNombre(p.getNombre());
		persona.setApellido(p.getApellido());
		persona.setEmail(p.getEmail());
		persona.setTele(p.getTele());
		return persona;
	}
	
}
