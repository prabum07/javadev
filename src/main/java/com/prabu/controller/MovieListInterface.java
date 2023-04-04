package com.prabu.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface MovieListInterface extends JpaRepository<Movies,Long> {

	List<Movies> moviesByActor(String name);
}
