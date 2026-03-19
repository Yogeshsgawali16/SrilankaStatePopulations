package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.State;

@Repository
public interface StateRepo extends JpaRepository<State, Long> {

}
