package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Objetivos de aprendizagem para a semana: Spring e Postman";
	}
}
