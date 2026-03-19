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
<<<<<<< HEAD
	 StateService service;
=======
	StateService service;
>>>>>>> 08d88ffa09ff5148a6a99de2e3335924541a5b07

	@GetMapping("/allstatepopulations")
	public List<State> all() {

		return service.all();

	}

	@GetMapping("/highestpopulationssrilanka")//highestpopulations
	public State highestpopulations() {

		return service.highestpopulations();

	}

	@RequestMapping("/topfivess")
	public List<State> topfive() {

		return service.topfivePopulations();
	}

	@GetMapping("/{id}")
	public State abc(@PathVariable int id) {
		return service.speficId(id);

	}
}
