package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.State;
import com.example.service.StateService;

@RestController
public class StateController {

	@Autowired
	StateService service;

	@GetMapping("/allstatepopulations")
	public List<State> all() {

		return service.all();

	}

	@GetMapping("/highestpopulations")
	public State highestpopulations() {

		return service.highestpopulations();

	}

	@RequestMapping("/topfive")
	public List<State> topfive() {

		return service.topfivePopulations();
	}

	@GetMapping("/{id}")
	public State abc(@PathVariable int id) {
		return service.speficId(id);

	}
}
