package com.mnz.poc.docker.pocdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocDockerController {

	@GetMapping(value = "/poc/docker/hello/world")
	public String helloWorld() {
		return "Hello world docker!";
	}
}
