package com.example.demo;

import java.util.UUID;

public class Person {
	
	private String id ;
	private Long numeroCedula;
	private String nombre;
	private String apellido;
	private String email;
	private String tele;
	
	
	
	public Person() {
		this.id =UUID.randomUUID().toString();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Long getNumeroCedula() {
		return numeroCedula;
	}



	public void setNumeroCedula(Long numeroCedula) {
		this.numeroCedula = numeroCedula;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTele() {
		return tele;
	}



	public void setTele(String tele) {
		this.tele = tele;
	}

	
}
