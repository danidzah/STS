package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa que é um controller
@RequestMapping("/helloworld")//informa onde está o hello world

public class helloController {
	@GetMapping //pega informação do metodo e exibe
	public String hello () {
		return "Hello World! Seja, bem vindos ao Spring!";		
	}
	@GetMapping ("/bsms") //pega informação do metodo e exibe
	public String Bsm () {
		return "Comunicação, Mentalidade de crescimento, Orientação ao detalhe,Orientação ao Futuro, Persistência, Proatividade, Responsabilidade Pessoal Trabalho em Equipe";
	}
	@GetMapping ("/objetivos")//pega informação do metodo e exibe
	public String objetivos () {
		return "Me tornar uma excelente desenvolvedora java full stack";
	}
}