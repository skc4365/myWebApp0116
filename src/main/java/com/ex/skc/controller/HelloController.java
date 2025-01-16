package com.ex.skc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String getMethodName() {
		return "hello Docker 00";
	}

	@GetMapping("/1")
	public String getMethodName1() {
		return "hello Docker 11";
	}

	@GetMapping("/2")
	public String getMethodName2() {
		return "hello Docker 22";
	}

}
