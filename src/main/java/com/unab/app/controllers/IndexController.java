package com.unab.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class IndexController { 
	
	private static final String USERNAME = "Joel Cantillo";
	
	@Value("${text.indexController.test}")
	private String test;
	
	@Value("${text.mysql}")
	private String mysql;
	
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public void getPrueba1() {
		System.out.println("Hola mundo");
	}
	
	@GetMapping("/pruebaget")
	public String getPrueba2() {
		System.out.println("Hola mundo, bienvenido");
		return "Hola mundo, bienvenido";
	}
	
	@GetMapping("/pruebaget/{nombre}")
	public String getPrueba3(@PathVariable("nombre") String nombre ) {
		System.out.println("Hola " +  nombre + ", bienvenido");
		return "Hola " +  nombre + ", bienvenido";
	}
	
	@GetMapping("/requestBody")
	public Object getPrueba4(@RequestBody Object object) {
		System.out.println(object);
		return object;
	}
	
	@PostMapping("/requestBodyPost")
	public Object getPrueba5(@RequestBody Object object) {
		System.out.println(object);
		return object;
	}
	
	@PutMapping("/requestBodyPut")
	public Object getPrueba6(@RequestBody Object object) {
		System.out.println(USERNAME);
		System.out.println(test);
		System.out.println("Conexión a la base de datos de "+ mysql);
		System.out.println(object);
		return object;
	}


}
