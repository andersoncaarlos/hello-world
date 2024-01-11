package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Lista BSM:\n"
				+ "Comunicação, Proatividade, Orientação ao detalhe, Trabalho em equipe, Mentalidade de crescimento"
				+ "Orientação ao futuro, Responsabilidade pessoal.";
		
	}
	
	@GetMapping("/lista-objetivos")
	public String listaObjetivos() {
		return "Lista Objetivos de Aprendizagem:\n"
				+ "Entender melhor como funciona Framework Spring e os termos que são utilizados.\n";
		
	}
	
	
	
}
