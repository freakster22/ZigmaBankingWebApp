package com.zigma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zigma.entities.Login;
import com.zigma.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/log/{id}")
	public Login findLoginById(@PathVariable("id")long crn) {
		return loginService.findLoginById(crn);
	}

	@PostMapping("/log/add")
	public String add(Login login) {
		loginService.addLogin(login);
		System.out.println(login);
		return "new login is added: " + login.getId();

	}

	@PostMapping("/log/update")
	public String update(Login login) {
		if (loginService.findLoginById(login.getId()) != null) {
			loginService.updateLogin(login);

			return "login updated successfuly :" + login.getId();
		} else {
			return "login unsuccessful!";
		}
	}
}
