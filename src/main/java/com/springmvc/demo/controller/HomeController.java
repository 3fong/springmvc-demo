package com.springmvc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年11月22日 下午4:20:38
 */
@RestController
public class HomeController {

	@GetMapping("/")
	public String simple() {
		return "Hello world!";
	}
}
