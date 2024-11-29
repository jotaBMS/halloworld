package com.generation.halloworld.controller;

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
	
	@RequestMapping("/BMS")
	public class BMS {
		@GetMapping
		public String bms() {
			return " Generation's BMS !!!";
		}
		
		
		@RequestMapping("/metas")
		public class Metas {
			@GetMapping
			public String metas() {
				return " a meta da semana é revisar a metéria de POO !!!";
			}
	
 
		}}}


