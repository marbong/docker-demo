package com.kt.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {

	@GetMapping("{param}")
	public String hello(@PathVariable(name = "param") String param) {

		return String.format("{\"message\":\"%s\"}", param);

	}

}
