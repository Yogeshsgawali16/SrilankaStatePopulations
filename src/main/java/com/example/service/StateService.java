package com.example.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.State;
import com.example.repo.StateRepo;

@Service
public class StateService {

	@Autowired
	private StateRepo repo;

	public List<State> all() {

		return repo.findAll();
	}

	public State highestpopulations() {
		List<State> l1 = repo.findAll();
		return l1.stream().max(Comparator.comparing(State::getPopulations)).orElseThrow();
	}

	public List<State> topfivePopulations() {

		List<State> l2 = repo.findAll();
		System.out.println(l2);
		return l2.stream().sorted(Comparator.comparing(State::getPopulations).reversed()).limit(5)
				.collect(Collectors.toList());

	}
	public State speficId(int id) {
	    return repo.findById((long) id)
	            .orElseThrow();
	}
}
